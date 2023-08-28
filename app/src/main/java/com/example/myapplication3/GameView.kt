package com.example.myapplication3

import android.content.Context
import android.graphics.Canvas
import android.os.CountDownTimer
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class GameView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    var sus = Sus(getContext(), resources)

    var timer = object: CountDownTimer(40000000, 10){
        override fun onTick(p0: Long) {
            invalidate()
        }
        override fun onFinish() {

        }

    }

    init{
        timer.start()
    }

    override fun onDraw(canvas: Canvas?){
        super.onDraw(canvas)
        sus.draw(canvas)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        sus.setXY(event!!.x, event.y)
        return true
    }
}