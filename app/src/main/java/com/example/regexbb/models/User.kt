package com.example.regexbb.models

import com.google.gson.annotations.SerializedName

class User {

    @SerializedName("data")
    var data: List<userAtom>? = null

    inner class userAtom {
        @SerializedName("userName")
        var userName: String = ""

        @SerializedName("password")
        var password: String = ""

        @SerializedName("email")
        var email: String = ""

        @SerializedName("isLooking")
        var isLooking: Boolean = false
    }
}