package com.example.clase_21092020_json

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiDogInterface {

    @GET("breeds/list")
    fun getDataFromApi() : Call<List<JsonDog>>

    @GET("breed/race/list")
    suspend fun  getDataFromApiCoroutines(mRace: String) : Response<List<RetrofitDog>>
}