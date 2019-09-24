package com.liuchuanzheng.wanandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.liuchuanzheng.wanandroid.base.BaseActivity

class MainActivity : BaseActivity() {
    private lateinit var fragments : List<Fragment>
    override fun doYourself() {

    }

    override fun getLyoutId(): Int {
        return R.layout.activity_main;
    }


}
