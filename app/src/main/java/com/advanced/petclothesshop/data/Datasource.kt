package com.advanced.petclothesshop.data

import com.advanced.petclothesshop.R
import com.advanced.petclothesshop.utils.ProductType

/***
 * Created by HoangRyan aka LilDua on 10/10/2024.
 */
class Datasource {
    fun loadPetClothesList() = listOf(
        PetClothes(
            id = 1,
            name = "Pet 1",
            originalPrice = 20.00,
            discountPrice = 10.00,
            image = R.drawable.ic_launcher_foreground,
            rating = "4.5",
            productType = ProductType.NEW_ARRIVAL,
            description = "Hello"
        ),
        PetClothes(
            id = 2,
            name = "Pet 2",
            originalPrice = 30.00,
            discountPrice = 20.00,
            image = R.drawable.ic_launcher_foreground,
            rating = "4.0",
            productType = ProductType.NEW_ARRIVAL,
            description = "Hello"
        ),
    )
}