package com.example.gardenhelper.presentation.fragment

import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gardenhelper.presentation.view_model.NotesViewModel
import com.example.gardenhelper.R
import com.example.gardenhelper.databinding.NotesFragmentBinding

class NotesFragment : Fragment() {

    companion object {
        fun newInstance() = NotesFragment()
    }

    private lateinit var viewModel: NotesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.notes_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[NotesViewModel::class.java]
        // TODO: Use the ViewModel
        val binding = NotesFragmentBinding.bind(this.requireView())

        binding.apply {
            notesFragmentMainLayout.setBackgroundColor(Color.rgb(211,239,213))
        }
    }

}