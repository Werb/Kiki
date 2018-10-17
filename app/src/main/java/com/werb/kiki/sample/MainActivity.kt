package com.werb.kiki.sample

import android.graphics.Color
import android.os.Bundle
import android.provider.Settings
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.FrameLayout
import com.werb.azure.Azure
import com.werb.kiki.Kiki
import com.werb.kiki.model.DisplayType
import com.werb.kiki.model.FloatPosition
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val floatView: View by lazy {
        FrameLayout(this).apply {
            setBackgroundColor(Color.BLUE)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addViewByWindowManager.setOnClickListener {
            Azure(this).permissions(Settings.ACTION_MANAGE_OVERLAY_PERMISSION)
                .subscribe { granted ->
                    if (granted) {
                        Kiki.Builder(applicationContext)
                            .setView(floatView)
                            .setDisplayType(DisplayType.ADD_VIEW_BY_WINDOW_MANAGER)
                            .setGravity(FloatPosition.BOTTOM_START)
                            .setSize(200, 200)
                            .build()
                    }
                }
                .request()
        }
    }

}
