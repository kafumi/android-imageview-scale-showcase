package io.github.kafumi.imageviewscaleshowcase.util

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import io.github.kafumi.imageviewscaleshowcase.R

class OutlinedImageView(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
    AppCompatImageView(context, attrs, defStyleAttr) {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    private val rect = RectF()
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)

    init {
        val a = context.theme.obtainStyledAttributes(attrs, R.styleable.OutlinedImageView, 0, 0)
        try {
            paint.color = a.getColor(R.styleable.OutlinedImageView_outlineColor, Color.TRANSPARENT)
            paint.strokeWidth = a.getDimension(R.styleable.OutlinedImageView_outlineWidth, 0f)
        } finally {
            a.recycle()
        }

        paint.style = Paint.Style.STROKE
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)

        if (changed) {
            val strokeHalf = paint.strokeWidth / 2f
            rect.left = strokeHalf
            rect.top = strokeHalf
            rect.right = width - strokeHalf
            rect.bottom = height - strokeHalf
        }
    }

    override fun onDrawForeground(canvas: Canvas) {
        super.onDrawForeground(canvas)
        canvas.drawRect(rect, paint)
    }
}