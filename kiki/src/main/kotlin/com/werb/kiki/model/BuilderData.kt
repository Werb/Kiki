package com.werb.kiki.model

import android.app.Activity
import android.view.View

/**
 * Created by wanbo on 2018/10/17.
 */
internal data class BuilderData(var view: View? = null,
                                var width: Int = 0,
                                var height: Int = 0,
                                var xOffset: Int = 0,
                                var yOffset: Int = 0,
                                var moveListener: ((Int, Int) -> Unit)? = null,
                                var gravity: Int? = null,
                                var tag: String = float_default_tag,
                                var filterActivities: MutableMap<Boolean, Array<out Class<out Activity>>> = mutableMapOf(),
                                var isAttachToEdge: Boolean = true,
                                var isShowInSystemDesktop: Boolean = false,
                                var displayType: DisplayType = DisplayType.ADD_VIEW_BY_WINDOW_MANAGER) {

    companion object {
        const val float_default_tag = "float_window_tag"
    }

}

/** float view display type  */
enum class DisplayType { ADD_VIEW_BY_WINDOW_MANAGER, ADD_VIEW_BY_ACTIVITY }

/** float view display position */
enum class FloatPosition { TOP_START, TOP_END, BOTTOM_START, BOTTOM_END }