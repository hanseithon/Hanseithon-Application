package com.b1ns.hanseithon.view.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.b1ns.hanseithon.R
import com.b1ns.hanseithon.data.Login
import com.b1ns.hanseithon.data.ResultLogin
import com.b1ns.hanseithon.utils.Utils.service
import com.b1ns.hanseithon.view.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

open class LoginActivity : AppCompatActivity() {

    var data: String? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        registerButton.setOnClickListener {
             startActivity<RegisterActivity>()
        }

        loginButton.setOnClickListener {
            if (loginId.text.toString().isNotEmpty() && loginPw.text.toString().isNotEmpty()) {
                login()
            } else {
                Toast.makeText(applicationContext, "아이디와 비밀번호를 입력해주세요.", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun login() {
        var user = Login(loginId.text.toString(), loginPw.text.toString(), null)
        val res: Call<ResultLogin> = service.login(user)
        res.enqueue(object : Callback<ResultLogin> {

            override fun onResponse(call: Call<ResultLogin>, response: Response<ResultLogin>) {
                when (response.code()) {
                    200 -> {
                        data = response.message()
                        finish()
                        startActivity<MainActivity>()

                    }
                    404 -> Toast.makeText(applicationContext, "아이디 혹은 비밀번호가 틀렸습니다.", Toast.LENGTH_LONG).show()
                    500 -> Toast.makeText(applicationContext, "서버 오류 ~!", Toast.LENGTH_LONG).show()
                }
            }

            override fun onFailure(call: Call<ResultLogin>, t: Throwable) {

            }

        })

    }

}
