package com.liuchuanzheng.wanandroid.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @author 刘传政
 * @date 2019-09-23 17:31
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLyoutId())
        doYourself()
    }

    abstract fun doYourself()

    abstract fun getLyoutId():  Int
}