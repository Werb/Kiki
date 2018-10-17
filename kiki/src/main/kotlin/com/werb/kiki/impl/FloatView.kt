package com.werb.kiki.impl

import android.view.View
import com.werb.kiki.model.BuilderData
import com.werb.kiki.model.DisplayType

/**
 * Created by wanbo on 2018/10/17.
 */
internal class FloatView(private val builderData: BuilderData) {

    fun buildUI(): View {
        return when(builderData.displayType) {
            DisplayType.ADD_VIEW_BY_WINDOW_MANAGER -> {
                FloatViewByWindowManager().initView(builderData).getView()
            }
            DisplayType.ADD_VIEW_BY_ACTIVITY -> {
                FloatViewByWindowManager().initView(builderData).getView()
            }
        }
    }

}