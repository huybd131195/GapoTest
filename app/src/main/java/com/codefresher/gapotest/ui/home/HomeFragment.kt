package com.codefresher.gapotest.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.codefresher.gapotest.MainActivity
import com.codefresher.gapotest.R
import com.codefresher.gapotest.databinding.FragmentHomeBinding
import com.codefresher.gapotest.ui.Post1Activity


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.post.postView.setOnClickListener {
            val intent = Intent(this@HomeFragment.requireContext(),Post1Activity::class.java)
            startActivity(intent)
        }
        return binding.root


    }


}