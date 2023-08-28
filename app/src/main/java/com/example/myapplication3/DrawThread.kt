package com.example.myapplication3

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.SurfaceHolder
import android.view.View

class DrawThread(context: Context, holder: SurfaceHolder, atrs: AttributeSet?) : Thread() {
    var d = View(context, atrs)
    var context: Context
    var holder: SurfaceHolder
    var atrs: AttributeSet? = null
    var apple = Apple(context, d.resources)
    var watermelon = Watermelon(context, d.resources)
    var peach = Peach(context, d.resources)
    var wood = Wood(context, d.resources)
    var cnt = 0
    var c = 0
    var cnt1 = 0
    var cnt2 = 0

    init {
        holder.also { this.holder = it }
        context.also { this.context = it }
        atrs.also { this.atrs = it }
    }

    var x: Int = -100
    var y: Int = -100

    var x1: Int = -100
    var y1: Int = -100

    var x2: Int = -100
    var y2: Int = -100

    override fun run() {
        x = (0..1000).random()
        y = (0..1500).random()
        x1 = (0..1000).random()
        y1 = (0..1500).random()
        x2 = (0..1000).random()
        y2 = (0..1500).random()
        while (running) {
            var canvas = holder.lockCanvas()
            if (apple.intersect(xt, yt) && watermelon.intersect(xt,yt) && peach.intersect(xt,yt)){
                c += 6
                xt = -100F
                yt = -100F
                x = (0..1000).random()
                y = (0..1500).random()
                x1 = (0..1000).random()
                y1 = (0..1500).random()
                x2 = (0..1000).random()
                y2 = (0..1500).random()
                if (canvas != null) {
                    for (i in 1..20) {
                        try {
                            var p = Paint()
                            p.color = Color.RED
                            p.textSize = 80F
                            canvas.drawText("МЕГА КОМБО!!!", 400F, 600F, p)
                        } catch (_: Exception) {

                        } finally {
                            holder.unlockCanvasAndPost(canvas)
                        }
                        holder.lockCanvas()
                    }
                }
                holder.lockCanvas()
            }
            if (apple.intersect(xt, yt) && watermelon.intersect(xt,yt)){
                c += 3
                xt = -100F
                yt = -100F
                x = (0..1000).random()
                y = (0..1500).random()
                x1 = (0..1000).random()
                y1 = (0..1500).random()
                if (canvas != null) {
                    for (i in 1..20) {
                        try {
                            var p = Paint()
                            p.color = Color.RED
                            p.textSize = 80F
                            canvas.drawText("КОМБО!!!", 400F, 600F, p)
                        } catch (_: Exception) {

                        } finally {
                            holder.unlockCanvasAndPost(canvas)
                        }
                        holder.lockCanvas()
                    }
                }
                holder.lockCanvas()
            }
            if (apple.intersect(xt, yt) && peach.intersect(xt,yt)){
                c += 5
                xt = -100F
                yt = -100F
                x = (0..1000).random()
                y = (0..1500).random()
                x2 = (0..1000).random()
                y2 = (0..1500).random()
                if (canvas != null) {
                    for (i in 1..20) {
                        try {
                            var p = Paint()
                            p.color = Color.GREEN
                            p.textSize = 80F
                            canvas.drawText("КОМБО!!!", 400F, 600F, p)
                        } catch (_: Exception) {

                        } finally {
                            holder.unlockCanvasAndPost(canvas)
                        }
                        holder.lockCanvas()
                    }
                }
                holder.lockCanvas()
            }
            if (watermelon.intersect(xt,yt) && peach.intersect(xt,yt)){
                c += 4
                xt = -100F
                yt = -100F
                x1 = (0..1000).random()
                y1 = (0..1500).random()
                x2 = (0..1000).random()
                y2 = (0..1500).random()
                if (canvas != null) {
                    for (i in 1..20) {
                        try {
                            var p = Paint()
                            p.color = Color.YELLOW
                            p.textSize = 80F
                            canvas.drawText("КОМБО!!!", 400F, 600F, p)
                        } catch (_: Exception) {

                        } finally {
                            holder.unlockCanvasAndPost(canvas)
                        }
                        holder.lockCanvas()
                    }
                }
                holder.lockCanvas()
            }
            if (apple.intersect(xt, yt)) {
                c += 2
                xt = -100F
                yt = -100F
                x = (0..1000).random()
                y = (0..1500).random()
                if (canvas != null) {
                    for (i in 1..20) {
                        try {
                            var p = Paint()
                            p.color = Color.RED
                            p.textSize = 80F
                            canvas.drawText("ПОПАДАНИЕ!!!", 400F, 600F, p)
                        } catch (_: Exception) {

                        } finally {
                            holder.unlockCanvasAndPost(canvas)
                        }
                        holder.lockCanvas()
                    }
                }
                holder.lockCanvas()
            }
            if (watermelon.intersect(xt, yt)) {
                ++c
                xt = -100F
                yt = -100F
                x1 = (0..1000).random()
                y1 = (0..1500).random()
                if (canvas != null) {
                    for (i in 1..20) {
                        try {
                            var p = Paint()
                            p.color = Color.GREEN
                            p.textSize = 80F
                            canvas.drawText("ПОПАДАНИЕ!!!", 400F, 600F, p)
                        } catch (_: Exception) {

                        } finally {
                            holder.unlockCanvasAndPost(canvas)
                        }
                        holder.lockCanvas()
                    }
                }
                holder.lockCanvas()
            }
            if (peach.intersect(xt, yt)) {
                c += 3
                xt = -100F
                yt = -100F
                x2 = (0..1000).random()
                y2 = (0..1500).random()
                if (canvas != null) {
                    for (i in 1..20) {
                        try {
                            var p = Paint()
                            p.color = Color.YELLOW
                            p.textSize = 80F
                            canvas.drawText("ПОПАДАНИЕ!!!", 400F, 600F, p)
                        } catch (_: Exception) {

                        } finally {
                            holder.unlockCanvasAndPost(canvas)
                        }
                        holder.lockCanvas()
                    }
                }
                holder.lockCanvas()
            }
            if (!peach.intersect(xt, yt) && !apple.intersect(xt,yt) && !watermelon.intersect(xt,yt) && xt != -100F && yt != -100F){
                if (canvas != null) {
                    for (i in 1..20) {
                        try {
                            var p = Paint()
                            p.color = Color.RED
                            p.textSize = 80F
                            canvas.drawText("ПРОМАЗАЛ!!!", 400F, 600F, p)
                        } catch (_: Exception) {

                        } finally {
                            holder.unlockCanvasAndPost(canvas)
                        }
                        xt = -100F
                        yt = -100F
                        holder.lockCanvas()
                    }
                }
                holder.lockCanvas()
            }
            if (canvas != null) {
                try {
                    ++cnt
                    ++cnt1
                    ++cnt2
                    canvas.drawColor(Color.WHITE)
                    wood.draw(canvas, 0, 0)
                    apple.draw(canvas, x, y)
                    watermelon.draw(canvas, x1, y1)
                    if (c >= 15) {
                        peach.draw(canvas, x2, y2)
                    }
                    var p = Paint()
                    p.color = Color.BLUE
                    p.textSize = 80F
                    canvas.drawText(c.toString(), 100F, 100F, p)
                    if (cnt == 60) {
                        x = (0..1000).random()
                        y = (0..1500).random()
                        cnt = 0
                    }
                    if (cnt1 == 100) {
                        x1 = (0..1000).random()
                        y1 = (0..1500).random()
                        cnt1 = 0
                    }
                    if (cnt2 == 40) {
                        x2 = (0..1000).random()
                        y2 = (0..1500).random()
                        cnt2 = 0
                    }
                } catch (_: Exception) {

                } finally {
                    holder.unlockCanvasAndPost(canvas)
                }
            }
        }
    }

    fun requestStop() {
        running = false
    }

    fun setXY(xt: Float, yt: Float) {
        this.xt = xt
        this.yt = yt
    }

    @Volatile
    var running: Boolean = true

    @Volatile
    var xt: Float = -100F

    @Volatile
    var yt: Float = -100F
}