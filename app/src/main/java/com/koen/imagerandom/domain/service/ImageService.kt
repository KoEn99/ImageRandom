package com.koen.imagerandom.domain.service

import com.koen.imagerandom.domain.api.ImageApi
import com.koen.imagerandom.ui.view.activity.MainActivityContract
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ImageService @Inject constructor(var imageApi: ImageApi) :
    BaseServiceImpl<MainActivityContract.Presenter>(),
    MainActivityContract.Service {
    override fun getListImage(search: String, page: Int, pagePer: Int) {
        imageApi.getImageList("21810552-7c96cc705e047c7f3d35a1017", search, "photo", pagePer, page)
            .subscribeOn(Schedulers.io())
            //  .delay(10, TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                presenter?.completeImage(it.hits)
            }, {

            })

    }

    override fun getImage() {

    }
}