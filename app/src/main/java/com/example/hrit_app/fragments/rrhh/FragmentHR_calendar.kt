package com.example.hrit_app.fragments.rrhh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hrit_app.R

class FragmentHR_calendar : Fragment() {

    lateinit var v: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_hr_calendar, container, false)

        // Inflate the layout for this fragment
        return v
    }


}