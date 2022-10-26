package com.news.ui.repository

import android.util.Range
import com.news.db.ArticleDatabase
import com.news.network.RetrofitInstance

class NewsRepository(db: ArticleDatabase) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.newsApi.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.newsApi.searchForNews(searchQuery, pageNumber)
}