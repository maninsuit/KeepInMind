package com.hcg.keepinmind.ui

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.hcg.keepinmind.MainActivity
import com.hcg.keepinmind.R
import com.hcg.keepinmind.util.extStartActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                this@SplashActivity extStartActivity MainActivity::class.java

            }

            override fun onTick(millisUntilFinished: Long) {

            }
        }.start()
    }
}
