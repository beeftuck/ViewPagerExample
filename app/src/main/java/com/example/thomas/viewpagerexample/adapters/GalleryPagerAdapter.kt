package com.example.thomas.viewpagerexample.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.example.thomas.viewpagerexample.fragments.GalleryPageFragment

class GalleryPagerAdapter(fm: FragmentManager?, private val data: List<String>) : FragmentStatePagerAdapter(fm) {
    
    override fun getItem(position: Int): Fragment {
        return GalleryPageFragment.newInstance(data[position])
    }

    override fun getCount(): Int {
        return data.size
    }

}