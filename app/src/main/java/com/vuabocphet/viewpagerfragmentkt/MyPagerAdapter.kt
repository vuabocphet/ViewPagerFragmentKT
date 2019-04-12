package com.vuabocphet.viewpagerfragmentkt

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter(var fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment? {
        when (p0) {

            0 -> {
                return MainFragment()
            }

            1 -> {
                return SubFragment()
            }
        }
        return null
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {

            0 -> {
                return  "MAIN";
            }

            1 -> {
                return "SUB";
            }
        }
        return super.getPageTitle(position)
    }

}