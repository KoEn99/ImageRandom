package com.koen.imagerandom.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.koen.imagerandom.R
import com.koen.imagerandom.domain.data.ImageDao

class ImageListRecycle constructor(private val listImage: List<ImageDao>, private val context: Context) :
    RecyclerView.Adapter<ImageListRecycle.ImageViewHolder>() {

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageViewWeb: ImageView? = null

        init {
            imageViewWeb = itemView.findViewById(R.id.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycle_image_item, parent, false)
        return ImageViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        Glide.with(context).load(listImage[position].largeImageURL).into(holder.imageViewWeb!!);
    }

    override fun getItemCount(): Int {
        return listImage.size
    }
}