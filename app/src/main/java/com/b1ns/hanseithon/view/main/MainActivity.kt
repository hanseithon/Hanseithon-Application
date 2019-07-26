package com.b1ns.hanseithon.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.b1ns.hanseithon.R
import com.b1ns.hanseithon.data.Board
import com.b1ns.hanseithon.data.ResultBoard
import com.b1ns.hanseithon.data.ResultLogin
import com.b1ns.hanseithon.utils.Utils
import com.b1ns.hanseithon.view.user.LoginActivity
import retrofit2.Call
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var boardData = Board()

        //val board : Call<ResultBoard> = Utils.service.board(boardData)
    }
}
