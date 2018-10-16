package com.werb.kiki

import android.content.Context
import android.graphics.Color
import android.graphics.PixelFormat
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.view.WindowManager
import android.content.Intent
import android.net.Uri
import android.provider.Settings


class MainActivity : AppCompatActivity() {

    private val floatView: View by lazy {
        FrameLayout(this).apply {
            setBackgroundColor(Color.RED)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val windowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val layoutParams =  WindowManager.LayoutParams()
        layoutParams.format = PixelFormat.RGBA_8888
        layoutParams.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL or WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        layoutParams.gravity = Gravity.START or Gravity.TOP
        layoutParams.width = 200
        layoutParams.height = 200
        layoutParams.x = 500
        layoutParams.y = 500
        layoutParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
        val windowToken = window.decorView.windowToken
        layoutParams.token = windowToken
        val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION)
        intent.data = Uri.parse("package:$packageName")
        startActivityForResult(intent, 123)
        windowManager.addView(floatView, layoutParams)
    }

}
