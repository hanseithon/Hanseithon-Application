package com.b1ns.hanseithon.utils


import com.b1ns.hanseithon.data.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface Services {

    @POST("/user/login")
    fun login(
        @Body login: Login
    ): Call<ResultLogin>

    @POST("/user/register")
    fun register(
        @Body register: Register
    ): Call<ResultRegister>
    @POST("/board")
    fun board(
        @Body board: Board
    ): Call<ResultBoard>
}