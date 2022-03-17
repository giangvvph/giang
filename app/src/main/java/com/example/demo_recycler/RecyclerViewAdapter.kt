package com.example.demo_recycler

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    private var titles = arrayOf(
        "Luffy",
        "Chopper",
        "Sanji",
        "Nami",
        "Nico Robin",
        "Ushop",
        "Zoro",
        "Franky",
        "Brook"
    )
    private var details = arrayOf(
        "Thuyền Trưởng",
        "Bác Sĩ",
        "Đầu Bếp",
        "Hoa tiêu",
        "Chị đại",
        "Sạ thủ",
        "Kiếm khách",
        "Thợ tàu giỏi",
        "Nhạc Công"
    )
    private var images = intArrayOf(
        R.drawable.lufy,
        R.drawable.chopper,
        R.drawable.sanji,
        R.drawable.nami,
        R.drawable.nicorobin,
        R.drawable.usopp,
        R.drawable.zoro,
        R.drawable.franky,
        R.drawable.brook
    )

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_deital)
        }
    }
}