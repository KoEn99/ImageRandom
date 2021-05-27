package com.koen.imagerandom.domain.api

import com.koen.imagerandom.domain.data.ImageDao
import com.koen.imagerandom.domain.data.RequestDao
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ImageApi {
    @GET("/api/")
    fun getImageList(
        @Query("key") key: String,
        @Query("q") param: String,
        @Query("image_type") imageType:String,
        @Query("per_page") pagePer:Int,
        @Query("page") page:Int
    ): Observable<RequestDao>
}