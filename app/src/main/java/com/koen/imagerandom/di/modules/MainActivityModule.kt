package com.koen.imagerandom.di.modules

import com.koen.imagerandom.domain.api.ImageApi
import com.koen.imagerandom.domain.service.ImageService
import com.koen.imagerandom.ui.presenter.ImageListPresenter
import com.koen.imagerandom.ui.view.activity.MainActivityContract
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    fun providesPresenter(imageService: ImageService): MainActivityContract.Presenter =
        ImageListPresenter(imageService)

    @Provides
    fun providesService(imageApi: ImageApi): MainActivityContract.Service = ImageService(imageApi)
}