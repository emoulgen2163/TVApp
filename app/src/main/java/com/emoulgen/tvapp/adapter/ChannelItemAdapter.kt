package com.emoulgen.tvapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emoulgen.tvapp.ChannelItemActivity
import com.emoulgen.tvapp.databinding.ChannelItemBinding

class ChannelItemAdapter(val context: Context, val list: List<String>): RecyclerView.Adapter<ChannelItemAdapter.ChannelItemViewHolder>() {

    class ChannelItemViewHolder(val binding: ChannelItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChannelItemViewHolder {
        return ChannelItemViewHolder(ChannelItemBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: ChannelItemViewHolder, position: Int) {
        holder.binding.apply {
            channelName.text = list[position]
            linkName.text = "Link ${list[position]}"

            root.setOnClickListener {
                val intent = Intent(context, ChannelItemActivity::class.java)
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int = list.size
}