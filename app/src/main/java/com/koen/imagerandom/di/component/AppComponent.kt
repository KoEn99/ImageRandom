package com.koen.imagerandom.di.component

import com.koen.imagerandom.di.modules.MainActivityModule
import com.koen.imagerandom.di.modules.RetrofitModule
import com.koen.imagerandom.ui.view.activity.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [MainActivityModule::class, RetrofitModule::class])
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}