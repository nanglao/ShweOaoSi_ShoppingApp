package com.example.shweoaosi_shoppingapp.call

import com.example.shweoaosi_shoppingapp.model.SearchModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.QueryMap

interface ApiService {
    @GET("20170628")
    fun callSearch(
        @HeaderMap headerMap: Map<String, String>,
        @QueryMap queryMap: Map<String, String>
    ): Single<SearchModel>

}