package com.rbch.books.libros.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rbch.books.libros.R
import com.rbch.books.libros.databinding.FragmentListadelibrosBinding.inflate
import com.rbch.books.libros.databinding.FragmentListadelibrosBinding


class Listadelibros : Fragment() {

    private var _binding: FragmentListadelibrosBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.libro1.setOnClickListener {
            findNavController().navigate(R.id.prologo)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}