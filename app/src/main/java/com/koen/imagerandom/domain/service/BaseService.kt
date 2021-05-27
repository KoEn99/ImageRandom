package com.koen.imagerandom.domain.service

import com.koen.imagerandom.ui.presenter.BasePresenter

interface BaseService<P : BasePresenter<*>> {
    fun attachPresenter(presenter: P)
}