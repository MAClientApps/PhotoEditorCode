package com.msstore.ultraimageeditor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.burhanrashid52.photoediting.R


class UltraSplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ultra_splash)

        val intent = Intent(this@UltraSplashActivity, EditImageActivity::class.java)
        startActivity(intent)
        finish()


    }
}