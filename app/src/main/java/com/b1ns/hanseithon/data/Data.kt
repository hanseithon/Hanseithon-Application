package com.b1ns.hanseithon.data

data class Register(val id: String, val password: String, val name: String, val age: Int)

data class Login(val id: String, val password: String, val token: String?, val user: String?)

data class ResultLogin(val success: Boolean, val message: String)

data class ResultRegister(val success: Boolean, val message: String)