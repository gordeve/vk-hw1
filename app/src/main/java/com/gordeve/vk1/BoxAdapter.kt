package com.gordeve.vk1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class BoxAdapter() : Adapter<BoxViewHolder>() {
    val items = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoxViewHolder =
        BoxViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        )


    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: BoxViewHolder, position: Int) =
        holder.bind(items[position])

    fun setItems(list: List<Int>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    fun addItems(item: Int) {
        items.add(item)
        notifyItemInserted(items.size - 1)
    }
}