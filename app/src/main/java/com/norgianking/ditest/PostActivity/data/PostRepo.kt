package com.norgianking.ditest.PostActivity.data

import com.norgianking.ditest.PostActivity.service.ApiEndPoint
import javax.inject.Inject

class PostRepo @Inject constructor (val apiEndPoint: ApiEndPoint) {

    suspend  fun  getPost() = apiEndPoint.getPosts()
}