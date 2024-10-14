package com.advanced.petclothesshop.ui.home.product_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.advanced.petclothesshop.data.PetClothes
import com.advanced.petclothesshop.databinding.ItemProductBinding

/***
 * Created by HoangRyan aka LilDua on 10/14/2024.
 */
class ProductListAdapter(
    private val productList: List<PetClothes>,
    val onItemClick: (PetClothes) -> Unit
) : RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(petClothes: PetClothes) {
            binding.product = petClothes
            binding.imageProduct.setImageResource(petClothes.image)
            if (petClothes.discountPrice.equals("")) {
                binding.textPrice.text = "${petClothes.originalPrice}"
            } else {
                binding.textPrice.text = "${petClothes.discountPrice}"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProductBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(petClothes = product)
        holder.itemView.setOnClickListener { onItemClick(product) }
    }
}