package com.emoulgen.tvapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.emoulgen.tvapp.adapter.ChannelItemAdapter
import com.emoulgen.tvapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = listOf("1", "2", "3", "4", "5", "6")

        binding.channelList.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 3)
            adapter = ChannelItemAdapter(this@MainActivity, list)
        }
    }
}