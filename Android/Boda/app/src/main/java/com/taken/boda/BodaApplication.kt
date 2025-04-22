package com.taken.boda

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class BodaApplication : Application() {

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }

    companion object {

        var instance: BodaApplication? = null
    }

}