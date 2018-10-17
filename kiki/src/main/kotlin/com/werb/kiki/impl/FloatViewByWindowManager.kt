package com.werb.kiki.impl

import android.content.Context
import android.graphics.PixelFormat
import android.os.Build
import android.view.WindowManager
import com.werb.kiki.core.FloatInterface
import com.werb.kiki.core.ViewInterface
import com.werb.kiki.model.BuilderData

/**
 * Created by wanbo on 2018/10/17.
 */
internal class FloatViewByWindowManager: FloatInterface {

    override fun initView(builderData: BuilderData): ViewInterface {
        val  view = FloatViewImpl(builderData.applicationContext).apply {
            initData(builderData)
        }

        val windowManager = builderData.applicationContext.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val layoutParams =  WindowManager.LayoutParams()
        layoutParams.format = PixelFormat.RGBA_8888
        layoutParams.flags = (WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
            or WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
            or WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        when {
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.O -> layoutParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1 -> layoutParams.type = WindowManager.LayoutParams.TYPE_PHONE
            else -> layoutParams.type = WindowManager.LayoutParams.TYPE_TOAST
        }
        windowManager.addView(view, layoutParams)

        return view
    }


}