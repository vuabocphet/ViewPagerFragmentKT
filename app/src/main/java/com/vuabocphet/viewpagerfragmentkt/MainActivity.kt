package com.vuabocphet.viewpagerfragmentkt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private var tabs:TabLayout?=null
    private var pagers: ViewPager?=null
    private var myPagerAdapter: MyPagerAdapter?=null

     private var btnChange:Button?=null;


//   override fun onCreate(savedInstanceState: Bundle?) {
//       super.onCreate(savedInstanceState);
//       setContentView(R.layout.activity_main);
//
//       btnChange = findViewById(R.id.btnChange) as Button
//
//        val fragmentManager:FragmentManager = getSupportFragmentManager();
//
//       // add fragment vao activity
//       val mainFragment = MainFragment();
//       fragmentManager.beginTransaction().add(R.id.container, mainFragment).commit();
//
//
//       // thay doi fragment tren activ
//
//       btnChange!!.setOnClickListener(View.OnClickListener {
//         val  subFragment=SubFragment()
//           fragmentManager.beginTransaction().replace(R.id.container, subFragment).commit();
//       })
//
//   }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)
        tabs = findViewById(R.id.tabs) as TabLayout
        pagers = findViewById(R.id.pagers) as ViewPager
        myPagerAdapter= MyPagerAdapter(supportFragmentManager)
        pagers!!.adapter=myPagerAdapter
        tabs!!.setupWithViewPager(pagers)
    }
}
