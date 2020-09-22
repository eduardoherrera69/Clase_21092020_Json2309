package com.example.clase_21092020_json


import com.google.gson.annotations.SerializedName

data class JsonDog(
    @SerializedName("message")
    val message: List<String>,
    @SerializedName("status")
    val status: String
)