package com.news.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.news.R
import com.news.databinding.FragmentSavedNewsBinding
import com.news.databinding.FragmentSearchNewsBinding
import com.news.ui.NewsActivity
import com.news.ui.viewModels.NewsViewModel

class SearchNewsFragment : Fragment() {
    private var _binding: FragmentSearchNewsBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).newsViewModel
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}