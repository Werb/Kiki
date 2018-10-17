package com.werb.kiki.impl

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.werb.kiki.core.ViewInterface
import com.werb.kiki.model.BuilderData

/**
 * Created by wanbo on 2018/10/17.
 */
internal class FloatViewImpl: ViewInterface, FrameLayout {

    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    // data
    private lateinit var builderData: BuilderData

    // UI
    private lateinit var floatView: View
    private val floatLayoutParams: FrameLayout.LayoutParams by lazy { FrameLayout.LayoutParams(MarginLayoutParams.WRAP_CONTENT, MarginLayoutParams.WRAP_CONTENT) }

    // touch

    override fun getView(): View = this

    override fun initData(builderData: BuilderData) {
        this.builderData = builderData.apply {
            this@FloatViewImpl.id = this.tag.hashCode()
            this@FloatViewImpl.floatView = this.view ?: throw NullPointerException("You didn't set the float view in Kiki.Builder.setView!")
            this@FloatViewImpl.floatLayoutParams.width = this.width
            this@FloatViewImpl.floatLayoutParams.height = this.height
        }
    }

    override fun hasAddFloatView(): Boolean {
        val index = indexOfChild(builderData.view)
        return index >= 0
    }

    override fun getFloatTag(): String = builderData.tag

    override fun addUI() {
        // add view in parent
        if (!hasAddFloatView()) {
            addView(floatView, floatLayoutParams)
            floatLayoutParams.gravity = builderData.floatPosition.gravity
        }
    }

    override fun removeUI() {
        removeView(floatView)
    }

    override fun dismiss() {
    }

    override fun show() {
    }

    override fun updateXY(x: Int, y: Int) {
    }

    override fun updateX(x: Int) {
    }

    override fun updateY(y: Int) {
    }

    override fun getFloatViewX(): Int = 0

    override fun getFloatViewY(): Int = 0
}