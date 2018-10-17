package com.werb.kiki.core

import android.app.Activity
import android.support.annotation.IdRes
import android.view.View
import com.werb.kiki.Kiki
import com.werb.kiki.model.DisplayType

/**
 * [com.werb.kiki.Kiki.Builder] interface class
 * Created by wanbo on 2018/10/16.
 */
internal interface BuilderInterface {

    fun setView(view: View): Kiki.Builder

    fun setViewById(@IdRes id: Int): Kiki.Builder

    fun setSize(width: Int, height: Int): Kiki.Builder

    fun setOffset(xOffset: Int, yOffset: Int): Kiki.Builder

    fun setGravity(gravity: Int): Kiki.Builder

    /** distinguish unique key in multiple views */
    fun setTag(tag: String): Kiki.Builder

    /** when float view move in window the update of the location will be called back to this listener */
    fun setMoveListener(moveListener: ((x: Int, y: Int) -> Unit)): Kiki.Builder

    /** is displayed on the current Activity */
    fun setActivityFilter(show: Boolean, vararg activities: Class<out Activity>): Kiki.Builder

    /** whether attachToEdge when move stop */
    fun isAttachToEdge(attach: Boolean): Kiki.Builder

    /** is show in System desktop when user back home , only support  */
    fun isShowInSystemDesktop(show: Boolean): Kiki.Builder

    /** set float window display type see [DisplayType] */
    fun setDisplayType(displayType: DisplayType): Kiki.Builder

}