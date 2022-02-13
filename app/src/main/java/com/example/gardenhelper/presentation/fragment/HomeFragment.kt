package com.example.gardenhelper.presentation.fragment

import android.graphics.Color
import android.net.Uri
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.navigation.fragment.findNavController
import com.example.gardenhelper.R
import com.example.gardenhelper.databinding.HomeFragmentBinding
import com.example.gardenhelper.presentation.view_model.HomeViewModel
import kotlinx.android.synthetic.main.toolbar_home_fragment.*

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel

        val binding = HomeFragmentBinding.bind(this.requireView())

        binding.apply {
            homeFragmentMainLayout.setBackgroundColor(Color.rgb(211,239,213))

            image_button_profile.setOnClickListener {
                val uri = Uri.parse("myApp://feature-profile")
                findNavController().navigate(uri)
            }
        }

    }

}