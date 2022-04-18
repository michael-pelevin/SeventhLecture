package com.example.seventhlecture

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MainFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.open_frag_btn).setOnClickListener {
            val frag = MyFragment()

            requireActivity().supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.show_fargment, R.anim.hide_fragment, R.anim.show_fargment, R.anim.hide_fragment)
                .replace(R.id.main_container, frag).addToBackStack(null)
                .commit();
        }
    }

}