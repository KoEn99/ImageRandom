package com.koen.imagerandom.ui.presenter

import com.koen.imagerandom.ui.view.BaseView

open class BasePresenterImpl<V : BaseView> : BasePresenter<V> {
    var view: V ?= null
        private set
    override fun attach(view: V) {
        this.view = view
    }

    override fun detach() {
        this.view = null
    }
}