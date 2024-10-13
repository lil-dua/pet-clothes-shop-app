package com.advanced.petclothesshop.data

import androidx.annotation.DrawableRes
import com.advanced.petclothesshop.utils.ProductType

/***
 * Created by HoangRyan aka LilDua on 10/10/2024.
 */
data class PetClothes (
    val id: Int,
    val name: String,
    val originalPrice: Double,
    val discountPrice: Double,
    @DrawableRes val image: Int,
    val rating: String,
    val productType: ProductType,
    val description: String,
)