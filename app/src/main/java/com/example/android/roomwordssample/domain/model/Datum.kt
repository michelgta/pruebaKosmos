package com.example.android.roomwordssample.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Datum {

    @Json(name = "id")
    var id: Int? = null

    @Json(name = "email")
    var email: String? = null

    @Json(name = "first_name")
    var first_name: String? = null

    @Json(name = "last_name")
    var last_name: String? = null

    @Json(name = "avatar")
    var avatar: String? = null


}