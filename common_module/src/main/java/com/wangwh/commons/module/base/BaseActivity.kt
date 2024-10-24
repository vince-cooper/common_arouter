package com.wangwh.commons.module.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.greenrobot.eventbus.EventBus

/**
 * 作者: wenhui.w
 * 日期: 2024-10-24 14:03
 * 描述:
 */
open class BaseActivity : AppCompatActivity() {

    open val needEventBus = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (needEventBus) {
            EventBus.getDefault().register(this)
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (needEventBus) {
            EventBus.getDefault().unregister(this)
        }
    }
}