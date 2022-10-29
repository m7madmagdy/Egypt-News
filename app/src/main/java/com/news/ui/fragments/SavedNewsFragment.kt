package com.news.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.news.databinding.FragmentFavoriteNewsBinding
import com.news.ui.NewsActivity
import com.news.ui.viewModels.NewsViewModel

class SavedNewsFragment : Fragment() {
    private var _binding: FragmentFavoriteNewsBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavoriteNewsBinding.inflate(inflater, container, false)
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