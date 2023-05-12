package com.norgianking.ditest.PostActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.norgianking.ditest.PostActivity.view_model.PostViewModel
import com.norgianking.ditest.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PostActivity : AppCompatActivity() {

    private  val postViewModel : PostViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        postViewModel.getPostLiveData().observe(this) {

            Log.i("arjun","$it")
        }

        postViewModel.getPost()
    }
}