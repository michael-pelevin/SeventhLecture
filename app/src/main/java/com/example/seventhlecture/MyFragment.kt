package com.example.seventhlecture

import android.animation.*
import android.animation.ValueAnimator.INFINITE
import android.animation.ValueAnimator.REVERSE
import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.LinearInterpolator
import android.widget.Button
import androidx.fragment.app.Fragment

class MyFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    val textColor = PropertyValuesHolder.ofInt(
        "textColor",
        Color.parseColor("#FF6200EE"),
        Color.parseColor("#FFFF2903")
    )


    @SuppressLint("ObjectAnimatorBinding")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val view1 = view.findViewById<View>(R.id.view)
        val view2 = view.findViewById<View>(R.id.view2)
        var startColor = Color.parseColor("#FF6200EE")
        val endColor = Color.parseColor("#FFFF2903")
        view.findViewById<Button>(R.id.button).setOnClickListener {


            view1.animate().apply {
                scaleX(1.8f)
                scaleY(1.5f)
                duration = 400
                interpolator = LinearInterpolator()
                start()
            }
            ObjectAnimator.ofArgb(view1, "backgroundColor", startColor, endColor)
                .apply {
                    duration = 400
                    repeatCount = 0
                    start()
                    startColor = Color.parseColor("#FFFF2903")
                }
            view2.animate().apply {
                scaleY(6f)
                scaleX(0.93f)
                duration = 400
                interpolator = LinearInterpolator()
                start()
            }


//            val scaleX1 = PropertyValuesHolder.ofFloat(View.SCALE_X, view1.width.toFloat(), 2f)
//            val scaleY1 = PropertyValuesHolder.ofFloat(View.SCALE_Y, view1.height.toFloat(), 1.5f)
//            val background1 = PropertyValuesHolder.ofObject("backgroundColor", ArgbEvaluator(), startColor, endColor)
//
//            val animator1 = ObjectAnimator.ofPropertyValuesHolder(view1, scaleX1, scaleY1, background1).apply {
//                duration = 400
//                interpolator = LinearInterpolator()
//                repeatCount = 0
//            }
//
//            val scaleY2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, view2.height.toFloat(), 6f)
//
//            val animator2 = ObjectAnimator.ofPropertyValuesHolder(view2, scaleY2).apply {
//                duration = 400
//                interpolator = LinearInterpolator()
//                repeatCount = 0
//
//            }
//
//            AnimatorSet().apply {
//                play(animator1).with(animator2)
//
//                start()
//            }
        }
    }

}