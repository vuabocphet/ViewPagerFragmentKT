package com.vuabocphet.viewpagerfragmentkt

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SubFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view:View?=inflater.inflate(R.layout.sub_fragment,container,false)

        return view

    }
}