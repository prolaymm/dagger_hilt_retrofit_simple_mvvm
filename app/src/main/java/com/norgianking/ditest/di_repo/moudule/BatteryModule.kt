package com.norgianking.ditest.di_repo.moudule

import com.norgianking.ditest.di_repo.Battery
import com.norgianking.ditest.di_repo.Cobalt
import com.norgianking.ditest.di_repo.Lithium
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object BatteryModule {

    @Provides
    fun getCobalt() : Cobalt {

        return  Cobalt()
    }

    @Provides
    fun getLithium() : Lithium{

        val lithium = Lithium()
        lithium.test()
        return lithium
    }

    @Singleton
    @Provides
    fun getBattery(cobalt: Cobalt, lithium: Lithium) : Battery{
        return  Battery(cobalt,lithium)
    }
}