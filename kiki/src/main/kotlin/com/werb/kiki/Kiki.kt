package com.werb.kiki

import android.app.Activity
import android.view.View
import com.werb.kiki.core.BuilderInterface
import com.werb.kiki.model.DisplayType

/**
 * Module Enter Class
 * Created by wanbo on 2018/10/16.
 */

class Kiki {

    class Builder : BuilderInterface {

        override fun setView(view: View): Builder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setViewById(id: Int): Builder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setSize(width: Int, height: Int): Builder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setOffset(xOffset: Int, yOffset: Int): Builder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setGravity(gravity: Int): Builder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setTag(tag: String): Builder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setMoveListener(moveListener: (x: Int, y: Int) -> Unit): Builder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setActivityFilter(show: Boolean, vararg activities: Class<out Activity>): Builder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isAttachToEdge(attach: Boolean): Builder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isShowInSystemDesktop(show: Boolean): Builder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setDisplayType(displayType: DisplayType): Builder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

}