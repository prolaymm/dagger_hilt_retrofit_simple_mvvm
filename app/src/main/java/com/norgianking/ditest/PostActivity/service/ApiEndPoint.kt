package com.norgianking.ditest.PostActivity.service

import com.norgianking.ditest.PostActivity.vo.PostVo
import retrofit2.http.GET

interface ApiEndPoint {

    @GET("posts")

    suspend fun  getPosts(): List<PostVo>
}