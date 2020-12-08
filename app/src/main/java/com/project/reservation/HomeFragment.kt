package com.project.reservation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.reservation.adapter.HomeImageSliderAdapter
import com.project.reservation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get()= _binding!!
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.viewpager.adapter = HomeImageSliderAdapter(this)
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}