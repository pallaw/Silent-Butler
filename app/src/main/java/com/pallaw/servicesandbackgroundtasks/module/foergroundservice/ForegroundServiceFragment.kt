package com.pallaw.servicesandbackgroundtasks.module.foergroundservice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pallaw.servicesandbackgroundtasks.R

/**
 * A simple [Fragment] subclass.
 */
class ForegroundServiceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_foreground_service, container, false)
    }

}
