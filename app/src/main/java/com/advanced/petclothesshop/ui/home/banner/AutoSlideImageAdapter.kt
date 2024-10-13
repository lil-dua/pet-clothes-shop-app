package com.advanced.petclothesshop.ui.home.banner

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.advanced.petclothesshop.R

/***
 * Created by HoangRyan aka LilDua on 10/12/2024.
 */
class AutoSlideImageAdapter(
    private val imageList: List<Int>,
    val onItemClick: (Int) -> Unit
): RecyclerView.Adapter<AutoSlideImageAdapter.SliderViewHolder>() {

    class SliderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.slider_item, parent, false)
        return SliderViewHolder(view)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.imageView.setImageResource(imageList[position])
    }

    override fun getItemCount(): Int = imageList.size
}