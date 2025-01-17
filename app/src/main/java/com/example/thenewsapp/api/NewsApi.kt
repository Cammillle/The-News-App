package com.example.thenewsapp.api

import com.example.thenewsapp.models.NewsResponse
import com.example.thenewsapp.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface NewsApi {

    @GET("v2/top-headlines")
    suspend fun getHeadlines(
        @Query("apiKey")
        apiKey:String = API_KEY,
        @Query("page")
        page:Int = 1,
        @Query("country")
        country:String = "us"
    ): Response<NewsResponse>


    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("apiKey")
        apiKey:String = API_KEY,
        @Query("page")
        page:Int = 1,
        @Query("q")
        searchQuery:String
    ):Response<NewsResponse>
}