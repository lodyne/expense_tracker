package com.example.expensetracker.api
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient{
//    private const val BASE_URL = "https://jsonplaceholder.typicode.com"
    private const val BASE_URL2 = "http://10.0.2.2:8000/api/v1/"

//    private const val BASE_URL3 = "https://apimocker.com"

//    private var retrofit: Retrofit? = null
//
//    fun getRetrofitInstance(): Retrofit {
//        if (retrofit == null) {
//            retrofit = Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//        }
//        return retrofit!!
//    }

    val api: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL2)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiService::class.java)
    }





}