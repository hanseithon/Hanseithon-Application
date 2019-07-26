package com.b1ns.hanseithon.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import com.b1ns.hanseithon.R
import com.b1ns.hanseithon.SettingActivity
import com.b1ns.hanseithon.SnsActivity
import com.google.android.material.navigation.NavigationView

import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var boardData = Board()

        //val board : Call<ResultBoard> = Utils.service.board(boardData)

        fab.setOnClickListener {
            startActivity<SnsActivity>()
        }

        menu.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }


    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){ // 네비게이션 메뉴가 클릭되면 스낵바가 나타난다.
            R.id.reword -> {

            }
            R.id.setting -> {
                startActivity<SettingActivity>()
            }
            R.id.userSetting ->{

            }
         }
        drawerLayout.closeDrawers() // 기능을 수행하고 네비게이션을 닫아준다.
        return false
    }



    override fun onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawers()
        }else{
            super.onBackPressed()
        }
    }

}
