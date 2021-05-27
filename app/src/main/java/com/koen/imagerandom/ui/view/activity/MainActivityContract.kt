package com.koen.imagerandom.ui.view.activity

import com.koen.imagerandom.domain.data.ImageDao
import com.koen.imagerandom.domain.service.BaseService
import com.koen.imagerandom.ui.presenter.BasePresenter
import com.koen.imagerandom.ui.view.BaseView

interface MainActivityContract {
    interface View: BaseView{
        fun displayImage(str:String)
        fun displayListImage(imageList: List<ImageDao>)
    }
    interface Presenter: BasePresenter<View>{
        fun getListRandomImage()
        fun getOneImage()
        fun completeImage(hits:List<ImageDao>)
    }
    interface Service: BaseService<Presenter>{
        fun getListImage(search:String, page:Int, pagePer:Int)
        fun getImage()
    }
}