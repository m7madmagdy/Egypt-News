package com.news.api

import com.news.models.NewsResponse
import com.news.util.Constants.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import kotlin.random.Random

interface NewsAPI {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String,
        @Query("page")
        pageNumber: Int,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>


    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>
}