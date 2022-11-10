package com.example.daggert.di.modules

import com.example.daggert.data.remote.UserService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

@Module
class NetModule {

    @Provides
    fun providesMoshi():Moshi{
        return Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
    }

    @Provides
    fun providesRetrofit(moshi: Moshi):Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://random-data-api.com/api/v2/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    @Provides
    fun providesUserService(retrofit: Retrofit):UserService{
        return retrofit.create(UserService::class.java)
    }

}