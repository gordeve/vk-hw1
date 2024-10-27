package com.gordeve.vk1

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BoxViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val text = view.findViewById<TextView>(R.id.text_1)
    private val image = view.findViewById<ImageView>(R.id.image_view)

    fun bind(number: Int) {
        text?.text = "$number"
        image?.setBackgroundColor(if (number % 2 == 0) Color.RED else Color.BLUE)
    }
}