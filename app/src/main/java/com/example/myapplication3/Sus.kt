package com.example.myapplication3

import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect

class Sus(context: Context, resources: Resources) {

    var bitmap : Bitmap
    var rects: ArrayList<Rect>
    var width : Int
    var height: Int
    var x = 0
    var y = 0

    init{
        bitmap = BitmapFactory.decodeResource(resources, R.drawable.cat)
        rects = ArrayList<Rect>()
        width = bitmap.width
        height = bitmap.height
        rects.add(Rect(0, 0, width, height))
    }

    fun draw(canvas: Canvas?) {
        val dist = Rect(x, y, x + width/5, y + height/5)
        canvas?.drawBitmap(bitmap, rects[0], dist, Paint())
    }

    fun setXY(x: Float, y: Float){
        this.x = x.toInt()
        this.y = y.toInt()
    }
}