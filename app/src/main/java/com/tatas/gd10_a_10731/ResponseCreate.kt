package com.tatas.gd10_a_10731

import com.google.gson.annotations.SerializedName

class ResponseCreate (
    @SerializedName("status") val stt:Int,
    @SerializedName("error") val e:Boolean,
    @SerializedName("message") val pesan:String,
)