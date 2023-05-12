package com.norgianking.ditest.di_repo

import android.util.Log
import javax.inject.Inject

class Mobile @Inject constructor(var battery: Battery,var processor: Processor) {

   init {
       Log.d("mobile","mobile working working")
   }
}