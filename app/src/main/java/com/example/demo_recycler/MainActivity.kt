package com.example.demo_recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var manager: RecyclerView.LayoutManager? = null
    private var adapTer: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        manager = LinearLayoutManager(this)
        var rv = findViewById<RecyclerView>(R.id.recycleView)
        rv.layoutManager = manager
        adapTer = RecyclerViewAdapter()
        rv.adapter = adapTer
    }
}