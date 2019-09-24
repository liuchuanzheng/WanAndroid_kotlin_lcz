package com.liuchuanzheng.wanandroid

import android.content.Intent
import com.liuchuanzheng.wanandroid.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : BaseActivity() {
    override fun getLyoutId(): Int {
        return R.layout.activity_splash
    }

    override fun doYourself() {
        tv_splash.setText("你好")
        GlobalScope.launch {
            delay(1000L)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }
    }
}
