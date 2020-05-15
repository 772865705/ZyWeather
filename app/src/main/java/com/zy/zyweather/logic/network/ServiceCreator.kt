package com.zy.zyweather.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Date: 2020/5/14 0014
 * Author: Zhaoyue
 */
object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>) :T = retrofit.create(serviceClass)

    inline fun <reified T> create():T = create(T::class.java)
}