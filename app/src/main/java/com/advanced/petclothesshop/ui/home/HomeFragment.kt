package com.advanced.petclothesshop.ui.home

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.advanced.petclothesshop.R
import com.advanced.petclothesshop.data.Datasource
import com.advanced.petclothesshop.data.PetClothes
import com.advanced.petclothesshop.databinding.FragmentHomeBinding
import com.advanced.petclothesshop.ui.home.banner.AutoSlideImageAdapter
import com.advanced.petclothesshop.ui.home.product_list.GridSpacingItemDecoration
import com.advanced.petclothesshop.ui.home.product_list.ProductListAdapter
import com.advanced.petclothesshop.utils.Constants

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null
    private val homeViewModel: HomeViewModel by viewModels()
    private var slideImageAdapter: AutoSlideImageAdapter? = null
    private val handler = Handler(Looper.getMainLooper())
    private var currentPage = 0
    private val listImageBanner = listOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.image_dog
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            homeFragment = this@HomeFragment
            lifecycleOwner = viewLifecycleOwner
            viewModel = homeViewModel

        }

        initViews()
        initListProducts()
    }

    private fun initListProducts() {
        val data = Datasource().loadPetClothesList()
        val productListAdapter = ProductListAdapter(
            productList = data,
            onItemClick = {
                navigationToClothesDetail(petClothes = it)
            }
        )
        binding?.recyclerViewProduct?.apply {
            layoutManager = GridLayoutManager(context.applicationContext, 2)
            addItemDecoration(GridSpacingItemDecoration(2, 16, true))
            adapter = productListAdapter
        }
    }

    private fun navigationToClothesDetail(petClothes: PetClothes) {
        val bundle = Bundle()
        bundle.putInt(Constants.KEY_CLOTHES_ID, petClothes.id)
        findNavController().navigate(R.id.action_navigation_home_to_navigation_clothes_detail, bundle)
    }

    private fun initViews() {
        // Banner adapter
//        slideImageAdapter = AutoSlideImageAdapter(
//            imageList = listImageBanner,
//            onItemClick = {
//
//            }
//        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
        slideImageAdapter = null
        handler.removeCallbacksAndMessages(null)
    }

    fun showClothesDetails() {
        findNavController().navigate(R.id.action_navigation_home_to_navigation_clothes_detail)
    }
}