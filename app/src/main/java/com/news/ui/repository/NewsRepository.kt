package com.news.ui.repository

import com.news.db.ArticleDatabase
import com.news.network.RetrofitInstance

class NewsRepository(db: ArticleDatabase) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.newsApi.getBreakingNews(countryCode, pageNumber)
}