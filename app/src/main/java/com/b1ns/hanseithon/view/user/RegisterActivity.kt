package com.b1ns.hanseithon.view.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.b1ns.hanseithon.R
import com.b1ns.hanseithon.data.Register
import com.b1ns.hanseithon.data.ResultRegister
import com.b1ns.hanseithon.toast
import com.b1ns.hanseithon.utils.Utils.service
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.startActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        register.setOnClickListener {
            if (registerId.text.toString().isNotEmpty() && registerPw.text.toString().isNotEmpty()
                && registerName.text.toString().isNotEmpty() && rePassword.text.toString().isNotEmpty()
            ) {
                join()
            } else {
                Toast.makeText(applicationContext, "필수 항목을 다 입력해주세요 !", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun join() {

        var signup = Register(
            registerId.text.toString(),
            registerPw.text.toString(),
            rePassword.text.toString(),
            registerName.text.toString()
        )
        val call: Call<ResultRegister> = service.register(signup)
        call.enqueue(object : Callback<ResultRegister> {
            override fun onResponse(call: Call<ResultRegister>, response: Response<ResultRegister>) {
                when (response.code()) {
                    200 -> {
                        finish()
                        toast("회원가입 성공 !")
                        startActivity<LoginActivity>()
                    }
                    412 -> toast("이미 존재하는 아이디 입니다.")
                    500 -> toast("서버 오류 !")
                }
            }

            override fun onFailure(call: Call<ResultRegister>, t: Throwable) {

            }

        })
    }
}
