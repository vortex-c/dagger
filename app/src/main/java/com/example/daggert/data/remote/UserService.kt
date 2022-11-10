package com.example.daggert.data.remote

import com.example.daggert.data.remote.user.User
import retrofit2.Response
import retrofit2.http.GET

interface UserService {

    @GET("users")
    suspend fun getUser():Response<User>

}