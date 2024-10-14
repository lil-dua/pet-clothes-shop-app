package com.advanced.petclothesshop.ui.clothes_detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.advanced.petclothesshop.R
import com.advanced.petclothesshop.data.Datasource
import com.advanced.petclothesshop.data.PetClothes
import com.advanced.petclothesshop.databinding.FragmentClothesDetailBinding
import com.advanced.petclothesshop.utils.Constants

class ClothesDetailFragment : Fragment() {

    private var binding: FragmentClothesDetailBinding? = null
    private val clothesDetailViewModel: ClothesDetailViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClothesDetailBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = clothesDetailViewModel
            clothesDetailsFragment = this@ClothesDetailFragment

            // Set up data
            val receivedId = requireArguments().getInt(Constants.KEY_CLOTHES_ID)
            val data: PetClothes? = Datasource().loadPetClothesList().find { it.id == receivedId }
            product = data
            imageProduct.setImageResource(data?.image?: R.drawable.image_dog)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun back() {
        findNavController().popBackStack()
    }
}