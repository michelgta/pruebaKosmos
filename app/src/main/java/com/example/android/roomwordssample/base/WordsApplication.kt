package com.example.android.roomwordssample.base

import android.app.Application
import com.example.android.roomwordssample.di.ApplicationModule
import com.example.android.roomwordssample.di.NetworkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class WordsApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        //Start koin modules
        startKoin {
            androidContext(this@WordsApplication)
            modules(listOf(ApplicationModule,NetworkModule))
        }
    }
}