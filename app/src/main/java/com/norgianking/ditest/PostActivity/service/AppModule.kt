package com.norgianking.ditest.PostActivity.service

import com.norgianking.ditest.PostActivity.util.NetworkConstants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getBaseUrl() : String = NetworkConstants.BASE_URL

    @Singleton
    @Provides
    fun getRetrofit(baseUrl: String) : Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Singleton
    @Provides

    fun getApiEndPoint(retrofit: Retrofit) : ApiEndPoint = retrofit.create(ApiEndPoint::class.java)
}