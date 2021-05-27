package com.koen.imagerandom.ui.presenter

import com.koen.imagerandom.ui.view.BaseView

interface BasePresenter<V: BaseView> {
    fun attach(view: V)
    fun detach()
}