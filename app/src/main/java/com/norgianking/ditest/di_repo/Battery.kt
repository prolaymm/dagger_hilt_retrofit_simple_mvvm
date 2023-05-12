package com.norgianking.ditest.di_repo

import android.util.Log
import javax.inject.Inject

class Battery(var cobalt: Cobalt,var lithium: Lithium) {

    init {
        Log.d("battery","battery working working")
    }
}