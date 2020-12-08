package com.project.reservation.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.project.reservation.R
import com.project.reservation.SlideImageFragment

class HomeImageSliderAdapter(fragment: Fragment) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            1 -> SlideImageFragment(R.drawable.image01)
            2 -> SlideImageFragment(R.drawable.image02)
            3 -> SlideImageFragment(R.drawable.image03)
            4 -> SlideImageFragment(R.drawable.image04)
            else -> SlideImageFragment(R.drawable.image05)
        }

    }

}