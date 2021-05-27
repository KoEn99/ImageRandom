package com.koen.imagerandom.ui.view.activity

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.koen.imagerandom.R
import com.koen.imagerandom.di.App
import com.koen.imagerandom.domain.data.ImageDao
import com.koen.imagerandom.ui.adapter.ImageListRecycle
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContract.View {
    @Inject lateinit var presenter: MainActivityContract.Presenter
    lateinit var recycleView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        App.get().injector.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycleView = findViewById(R.id.recycleView)
        recycleView.layoutManager = LinearLayoutManager(this)
        presenter.attach(this)
        presenter.getOneImage()
    }

    override fun displayImage(str:String) {
        //Glide.with(this).load(str).into(imageView);
    }

    override fun displayListImage(imageList: List<ImageDao>) {
        recycleView.adapter = ImageListRecycle(imageList, this)
    }
}