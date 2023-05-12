package com.norgianking.ditest.di_repo.moudule

import com.norgianking.ditest.di_repo.Processor
import com.norgianking.ditest.di_repo.SnapDragon
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
 class  SnapDragonModule {


   @Provides
    fun getSnapdragon(snapDragon: SnapDragon) : Processor{

       return  snapDragon
    }


   @Provides
   @Named("core")
   fun getCore() = 8

   @Provides
   @Named("clockSpeed")
   fun getClockSpeed() = 2
}