package com.koen.imagerandom.domain.data

data class RequestDao(val total:Long, val totalHits:Long ,var hits: List<ImageDao>)
