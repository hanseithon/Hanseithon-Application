package com.b1ns.hanseithon.data

data class Register(val id: String, val password: String, val rePassword: String, val name: String)

data class Login(val id: String, val password: String, val token: String?)

data class ResultLogin(val success: Boolean, val message: String)

data class ResultRegister(val success: Boolean, val message: String)

data class Board(val title: String, val content: String)

data class ResultBoard(val success: Boolean)