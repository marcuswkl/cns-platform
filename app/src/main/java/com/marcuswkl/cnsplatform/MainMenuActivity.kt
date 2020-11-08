package com.marcuswkl.cnsplatform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.marcuswkl.cnsplatform.ui.login.LoginActivity

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }

    fun openLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}
