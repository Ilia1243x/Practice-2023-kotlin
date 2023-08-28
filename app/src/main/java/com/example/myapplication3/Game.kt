package com.example.myapplication3

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View

class Game(context: Context, atrs: AttributeSet?): SurfaceView(context), SurfaceHolder.Callback{

    init{
        holder.addCallback(this)
    }

    var drawthread: DrawThread? = null

    override fun surfaceCreated(p0: SurfaceHolder) {
        drawthread = DrawThread(context, holder, atrs = null)
        drawthread?.start()
    }

    override fun surfaceChanged(p0: SurfaceHolder, p1: Int, p2: Int, p3: Int) {

    }

    override fun surfaceDestroyed(p0: SurfaceHolder) {
        drawthread?.requestStop()
        var retry = true
        while(retry){
            try{
                drawthread?.join()
                retry = false
            }catch (_: InterruptedException){

            }
        }
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        drawthread?.setXY(event!!.x, event.y)
        return false
    }
}