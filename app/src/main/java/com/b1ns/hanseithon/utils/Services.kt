package com.b1ns.hanseithon.utils

import com.b1ns.hanseithon.data.Login
import com.b1ns.hanseithon.data.Register
import com.b1ns.hanseithon.data.ResultLogin
import com.b1ns.hanseithon.data.ResultRegister
import retrofit2.Call

import retrofit2.http.Body
import retrofit2.http.POST

interface Services {
    interface Services {

        @POST("/login")
        fun login(
            @Body login: Login
        ): Call<ResultLogin>

        @POST("/join")
        fun register(
            @Body register: Register
        ): Call<ResultRegister>

    }
}