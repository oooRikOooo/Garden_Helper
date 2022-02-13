package com.example.gardenhelper.presentation.fragment

import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gardenhelper.presentation.view_model.CalendarViewModel
import com.example.gardenhelper.R
import com.example.gardenhelper.databinding.CalendarFragmentBinding

class CalendarFragment : Fragment() {

    companion object {
        fun newInstance() = CalendarFragment()
    }

    private lateinit var viewModel: CalendarViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.calendar_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CalendarViewModel::class.java)
        // TODO: Use the ViewModel

        val binding = CalendarFragmentBinding.bind(this.requireView())

        binding.apply {
            calendarFragmentMainLayout.setBackgroundColor(Color.rgb(211,239,213))
        }
    }

}