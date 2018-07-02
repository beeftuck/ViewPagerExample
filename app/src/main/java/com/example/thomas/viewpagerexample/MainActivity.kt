package com.example.thomas.viewpagerexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.thomas.viewpagerexample.adapters.GalleryPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var pagerAdapter: GalleryPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data: List<String> = listOf("test", "test")
        pagerAdapter = GalleryPagerAdapter(supportFragmentManager, data)

        vp_gallery.adapter = pagerAdapter
    }

    override fun onBackPressed() {

        if (vp_gallery.currentItem == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed()
        } else {
            // Otherwise, select the previous step.
            vp_gallery.setCurrentItem(vp_gallery.currentItem - 1)
        }
    }
}
