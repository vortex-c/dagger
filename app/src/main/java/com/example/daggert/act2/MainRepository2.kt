package com.example.daggert.act2

import com.example.daggert.data.remote.UserService
import com.example.daggert.data.remote.user.User
import javax.inject.Inject

class MainRepository2 @Inject constructor(
    val userService: UserService
) {
    suspend fun getUser(): User? {
        val response = userService.getUser()
        return if(response.isSuccessful){
            response.body()
        }else{
            null
        }
    }
}