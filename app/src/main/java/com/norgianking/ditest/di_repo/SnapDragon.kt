package com.norgianking.ditest.di_repo

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class SnapDragon @Inject constructor(@Named("core") var core: Int,@Named("clockSpeed") var clockSpeed: Int) : Processor {
    init {
        Log.d("snapdragon","snapdragon working core ${this.core} clockSpeed ${this.clockSpeed}")
        start()
    }
    override fun start() {
        Log.d("snapdragon_start","start the snapdragon working working")
    }

}