package com.werb.kiki.core

import com.werb.kiki.model.BuilderData

/**
 * Created by wanbo on 2018/10/17.
 */
internal interface ViewInterface {

    fun initData(builderData: BuilderData)

    fun hasAddFloatView(): Boolean

    fun getFloatTag(): String

    fun addUI()

    fun removeUI()

    fun dismiss()

    fun show()

    fun updateXY(x: Int, y: Int)

    fun updateX(x: Int)

    fun updateY(y: Int)

    fun getFloatViewX(): Int

    fun getFloatViewY(): Int

}