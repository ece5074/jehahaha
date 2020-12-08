package com.project.reservation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.reservation.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {

    //? = nullable (null값을 가질 수 있다)
    //!! = not null (null이 아니다)
    private var _binding: FragmentAccountBinding? = null
    private val binding get()= _binding!!
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_account, container, false)
    }
}