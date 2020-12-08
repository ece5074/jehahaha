package com.project.reservation

import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.reservation.databinding.FragmentSlideImageBinding

class SlideImageFragment(val image : Int ) : Fragment() {
    private var _binding: FragmentSlideImageBinding? = null
    private val binding get()= _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSlideImageBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.slideImage.setImageResource(image)

        //binding.slideImage.setImageURI(Uri.parse("http://www.dha.com.tr/newpics/news/230620111356175716857.jpg"))

        return view
    }
}