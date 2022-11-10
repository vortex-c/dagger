package com.example.daggert.data.remote.user

import com.squareup.moshi.Json

data class User(
    val id:Int,
    val uid:String,
    @Json(name = "first_name") val firstName:String,
    @Json(name = "last_name") val lastName:String
)