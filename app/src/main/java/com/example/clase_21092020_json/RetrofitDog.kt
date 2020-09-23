package com.example.clase_21092020_json


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitDog {

    companion object{
        private const val  URL_BASE = "https://dog.ceo/api/"

       fun getRetrofitDog() : ApiDogInterface {
            val mRetrofitDog = Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return mRetrofitDog.create(ApiDogInterface::class.java)
        }

    }

}