package com.advanced.petclothesshop.ui.welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.advanced.petclothesshop.R
import com.advanced.petclothesshop.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private var binding: FragmentWelcomeBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.welcomeFragment = this@WelcomeFragment
        binding?.lifecycleOwner = viewLifecycleOwner
    }

    fun goToHome() {
        findNavController().navigate(R.id.action_navigation_welcome_to_navigation_home)
    }
}