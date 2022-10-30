package com.news.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.news.R
import com.news.databinding.FragmentArticleBinding
import com.news.databinding.FragmentSearchNewsBinding
import com.news.ui.NewsActivity
import com.news.ui.viewModels.NewsViewModel

class ArticleFragment : Fragment() {
    private var _binding: FragmentArticleBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArticleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).newsViewModel
        val bundle = arguments
        val url = bundle?.getString("url")
        binding.webView.apply {
            webViewClient = WebViewClient()
            loadUrl(url!!)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}