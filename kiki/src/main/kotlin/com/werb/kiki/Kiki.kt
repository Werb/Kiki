package com.werb.kiki

import android.app.Activity
import android.content.Context
import android.view.View
import com.werb.kiki.core.BuilderInterface
import com.werb.kiki.core.ViewInterface
import com.werb.kiki.impl.FloatView
import com.werb.kiki.model.BuilderData
import com.werb.kiki.model.DisplayType
import com.werb.kiki.model.FloatPosition

/**
 * Module Enter Class
 * Created by wanbo on 2018/10/16.
 */

class Kiki {

    class Builder(applicationContext: Context) : BuilderInterface {

        private val builderData = BuilderData(applicationContext)

        override fun setView(view: View): Builder {
            builderData.view = view
            return this
        }

        override fun setSize(width: Int, height: Int): Builder {
            builderData.width = width
            builderData.height = height
            return this
        }

        override fun setOffset(xOffset: Int, yOffset: Int): Builder {
            builderData.xOffset = xOffset
            builderData.yOffset = yOffset
            return this
        }

        override fun setGravity(floatPosition: FloatPosition): Builder {
            builderData.floatPosition = floatPosition
            return this
        }

        override fun setTag(tag: String): Builder {
            builderData.tag = tag
            return this
        }

        override fun setMoveListener(moveListener: (x: Int, y: Int) -> Unit): Builder {
            builderData.moveListener = moveListener
            return this
        }

        override fun setActivityFilter(show: Boolean, vararg activities: Class<out Activity>): Builder {
            builderData.filterActivities[show] = activities
            return this
        }

        override fun isAttachToEdge(isAttachToEdge: Boolean): Builder {
            builderData.isAttachToEdge = isAttachToEdge
            return this
        }

        override fun isShowInSystemDesktop(show: Boolean): Builder {
            builderData.isShowInSystemDesktop = show
            return this
        }

        override fun setDisplayType(displayType: DisplayType): Builder {
            builderData.displayType = displayType
            return this
        }

        override fun build(): View {
            return FloatView(builderData).buildUI()
        }

    }

}