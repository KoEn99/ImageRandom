package com.koen.imagerandom.domain.service

import com.koen.imagerandom.ui.presenter.BasePresenter

open class BaseServiceImpl<P: BasePresenter<*>>: BaseService<P> {
    lateinit var presenter: P
    override fun attachPresenter(presenter: P) {
        this.presenter = presenter
    }
}