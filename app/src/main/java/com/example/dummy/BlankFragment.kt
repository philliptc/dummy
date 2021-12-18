package com.example.dummy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ViewSwitcher

class BlankFragment : Fragment() {

    private lateinit var view_switcher : ViewSwitcher
    private lateinit var previous : Button
    private lateinit var next : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view_switcher = view.findViewById(R.id.view_switcher)
        previous = view.findViewById(R.id.previous)
        next = view.findViewById(R.id.next)


        view_switcher.setInAnimation(AnimationUtils.loadAnimation(requireContext(), android.R.anim.slide_in_left))
        view_switcher.setOutAnimation(AnimationUtils.loadAnimation(requireContext(), android.R.anim.slide_out_right))

        previous.setOnClickListener{
            view_switcher.showPrevious()
        }

        next.setOnClickListener{
            view_switcher.showNext()
        }
    }


}