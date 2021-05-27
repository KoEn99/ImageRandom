package com.koen.imagerandom.di

import android.app.Application
import com.koen.imagerandom.di.component.AppComponent
import com.koen.imagerandom.di.component.DaggerAppComponent

class App: Application() {

    lateinit var injector: AppComponent
        private set

    companion object{
        private var instance: App ? = null
        @JvmStatic
        fun get(): App = instance!!
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        injector = DaggerAppComponent.builder().build()
    }

}