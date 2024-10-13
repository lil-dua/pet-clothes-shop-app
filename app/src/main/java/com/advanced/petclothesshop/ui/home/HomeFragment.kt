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
import com.advanced.petclothesshop.R
import com.advanced.petclothesshop.databinding.FragmentHomeBinding
import com.advanced.petclothesshop.ui.home.banner.AutoSlideImageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

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
    }

    private fun initViews() {
        // Banner adapter
        slideImageAdapter = AutoSlideImageAdapter(
            imageList = listImageBanner,
            onItemClick = {

            }
        )
        binding?.viewPagerBanner?.adapter = slideImageAdapter
        val runnable = object : Runnable {
            override fun run() {
                if (currentPage == listImageBanner.size) {
                    currentPage = 0
                }
                binding?.viewPagerBanner?.setCurrentItem(currentPage++, true)
                handler.postDelayed(this, 3000)
            }
        }
        handler.postDelayed(runnable, 3000)
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