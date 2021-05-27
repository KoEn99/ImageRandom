package com.koen.imagerandom.ui.presenter

import com.koen.imagerandom.domain.data.ImageDao
import com.koen.imagerandom.domain.service.ImageService
import com.koen.imagerandom.ui.view.activity.MainActivityContract
import javax.inject.Inject

class ImageListPresenter @Inject constructor(var imageService: ImageService) : BasePresenterImpl<MainActivityContract.View>(),
    MainActivityContract.Presenter {
    override fun getListRandomImage() {

    }
    var page = 1
    override fun getOneImage() {
        imageService.attachPresenter(this)
        imageService.getListImage("Biomutant", page, 200)
    }
    var list:ArrayList<ImageDao> = ArrayList()
    override fun completeImage(hits: List<ImageDao>) {
        /*for (i in hits){
            list.add(i)
        }
        if (list.size < 600)  {
            page++
            imageService.getListImage("yellow+flowers", page, 200)*/
        view?.displayListImage(hits)
    }
}