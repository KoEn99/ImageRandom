package com.koen.imagerandom.ui.presenter

import com.koen.imagerandom.domain.data.ImageDao
import com.koen.imagerandom.domain.service.ImageService
import com.koen.imagerandom.ui.view.activity.MainActivityContract
import javax.inject.Inject

class ImageListPresenter @Inject constructor(var imageService: ImageService) : BasePresenterImpl<MainActivityContract.View>(),
    MainActivityContract.Presenter {
    override fun getListRandomImage() {

    }

    override fun getOneImage() {
        imageService.attachPresenter(this)
        imageService.getListImage()
    }

    override fun completeImage(hits: List<ImageDao>) {
        view?.displayImage(hits[0].webformatURL)
    }
}