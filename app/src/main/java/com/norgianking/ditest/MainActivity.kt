package com.norgianking.ditest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.norgianking.ditest.di_repo.Mobile
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var  mobile: Mobile
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}