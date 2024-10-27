package com.gordeve.vk1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var fab: FloatingActionButton

    private val adapter = BoxAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        recyclerView = findViewById(R.id.recycler_view)
        fab = findViewById(R.id.fab)

        recyclerView.adapter = adapter

        fab.setOnClickListener {
            adapter.addItems(adapter.itemCount + 1)
            recyclerView.scrollToPosition(adapter.itemCount - 1)
        }

        adapter.setItems(
            savedInstanceState?.getIntegerArrayList("adapter_items") ?: listOf(1, 2, 3, 4, 5)
        )
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putIntegerArrayList("adapter_items", adapter.items)
    }
}