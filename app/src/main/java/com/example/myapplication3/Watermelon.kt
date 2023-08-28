package com.example.myapplication3

import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect

class Watermelon(context: Context, resources: Resources) {
    var bitmap: Bitmap
    var rects: ArrayList<Rect>
    var width: Int
    var height: Int
    var x = 0
    var y = 0

    init {
        bitmap = BitmapFactory.decodeResource(resources, R.drawable.watermelon)
        rects = ArrayList<Rect>()
        width = bitmap.width
        height = bitmap.height
        rects.add(Rect(0, 0, width, height))
    }

    fun draw(canvas: Canvas?, a: Int, b: Int) {
        x = a
        y = b
        val dist = Rect(x, y, x + width / 25, y + height / 25)
        canvas?.drawBitmap(bitmap, rects[0], dist, Paint())
    }

    fun intersect(xt: Float, yt: Float): Boolean {
        return xt > x.toFloat() && xt < x.toFloat() + width / 26 && yt > y.toFloat() && yt < y.toFloat() + height / 27
    }

}