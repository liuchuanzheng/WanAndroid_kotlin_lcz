package com.liuchuanzheng.wanandroid.moudle.home.adapter

import android.content.Context
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.liuchuanzheng.wanandroid.R

class HomePageAdapter private constructor(layoutResId: Int, data: List<String>) :
    BaseQuickAdapter<String, BaseViewHolder>(layoutResId, data) {

    constructor(context: Context?, data: List<String>) : this(R.layout.item_home_article, data)

    override fun convert(helper: BaseViewHolder?, item: String?) {
        helper?.setText(R.id.tv_item_home_title, item)
    }

}