package com.example.android.roomwordssample.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Users {

    @Json(name = "data")
    var data: MutableList<Datum>? = null

}