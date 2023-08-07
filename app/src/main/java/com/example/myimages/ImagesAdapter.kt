package com.example.myimages

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ImagesAdapter( val mList: ArrayList<DataImages>,private val onItemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<ImagesAdapter.MyViewHolder>() {

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(dataImages: DataImages,onItemClickListener: OnItemClickListener) {
            val itemImg = itemView.findViewById<ImageView>(R.id.item_img)

            Glide.with(itemView)
                .load(dataImages.imagesUrl) // Ma'lumot modelidan rasm manzili olinadi
                .placeholder(R.drawable.ic_launcher_background)
                .centerCrop()
                .into(itemImg)
            itemView.setOnClickListener {
                onItemClickListener.onItemClick(dataImages)
            }
        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.wallpaper_item, parent, false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = mList[position]
        holder.bind(data, onItemClickListener )




    }
    interface OnItemClickListener {
        fun onItemClick(data: DataImages)
    }

}