package com.liuchuanzheng.wanandroid.moudle.home.fragment

import androidx.recyclerview.widget.LinearLayoutManager
import com.liuchuanzheng.wanandroid.R
import com.liuchuanzheng.wanandroid.base.BaseFragment
import com.liuchuanzheng.wanandroid.moudle.home.adapter.HomePageAdapter
import kotlinx.android.synthetic.main.fragment_home_page.*

/**
 * @author 刘传政
 * @date 2019-09-24 10:36
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
class HomePageFragment : BaseFragment() {
    private lateinit var mAdapter: HomePageAdapter
    private var dataList: MutableList<String> = mutableListOf()
    override fun getLayoutId(): Int {
        return R.layout.fragment_home_page
    }

    override fun doYourself() {
        for (i in 0..9) {
            dataList.add("$i")
        }
        mAdapter = HomePageAdapter(context, dataList)
        rv_home.adapter = mAdapter
        rv_home.layoutManager = LinearLayoutManager(this.context!!)
        mAdapter?.notifyDataSetChanged()
    }
}