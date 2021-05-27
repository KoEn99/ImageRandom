package com.koen.imagerandom.ui.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.koen.imagerandom.R
import com.koen.imagerandom.di.App
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContract.View {
    @Inject lateinit var presenter: MainActivityContract.Presenter
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        App.get().injector.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
        presenter.attach(this)
        presenter.getOneImage()
    }

    override fun displayImage(str:String) {
        Glide.with(this).load(str).into(imageView);
    }

    override fun displayListImage() {

    }
}