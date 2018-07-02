package com.example.thomas.viewpagerexample.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.thomas.viewpagerexample.R

class GalleryPageFragment : Fragment() {

    companion object {

        val IMAGE_URI_KEY : String = "IMAGE_URI_KEY"

        fun newInstance(imageUri: String): GalleryPageFragment {
            var fragment = GalleryPageFragment()

            var arguments = Bundle()
            arguments.putString(GalleryPageFragment.IMAGE_URI_KEY, imageUri)
            fragment.arguments = arguments

            return fragment
        }
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater?.inflate(R.layout.fragment_gallery_page, container, false)
        return rootView
    }
}