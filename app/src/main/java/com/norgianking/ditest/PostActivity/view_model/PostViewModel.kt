package com.norgianking.ditest.PostActivity.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.norgianking.ditest.PostActivity.data.PostRepo
import com.norgianking.ditest.PostActivity.vo.PostVo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel  @Inject constructor(val  postRepo: PostRepo): ViewModel() {

    private  val  _post : MutableLiveData<List<PostVo>> = MutableLiveData()

    private val post : LiveData<List<PostVo>> = _post


    fun getPostLiveData() : LiveData<List<PostVo>> = post

    fun getPost() = viewModelScope.launch {
       val result =  postRepo.getPost()
        _post.value = result
    }

}