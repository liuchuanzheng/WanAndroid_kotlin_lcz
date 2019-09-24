package com.liuchuanzheng.wanandroid

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.liuchuanzheng.wanandroid.base.BaseActivity
import com.liuchuanzheng.wanandroid.moudle.home.fragment.HomePageFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    private lateinit var fragments : List<Fragment>
    override fun getLyoutId(): Int {
        return R.layout.activity_main;
    }
    override fun doYourself() {
        fragments = listOf(
            HomePageFragment(),
            HomePageFragment(),
            HomePageFragment()
        )
        vp_main.adapter = MyAdapter(supportFragmentManager)
        vp_main.pageMargin = 16
        vp_main.currentItem = 0
        vp_main.offscreenPageLimit = 3
    }


    inner class MyAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            return fragments[position]
        }

        override fun getCount(): Int = fragments.size

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            super.destroyItem(container, position, `object`)
        }

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            return super.instantiateItem(container, position)
        }
    }

}
