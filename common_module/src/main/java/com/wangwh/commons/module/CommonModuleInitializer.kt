package com.wangwh.commons.module

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import com.alibaba.android.arouter.launcher.ARouter

/**
 * 作者: wenhui.w
 * 日期: 2024-10-25 10:29
 * 描述: App Startup初始化库
 */
class CommonModuleInitializer : Initializer<Any> {
    /**
     * 该组件并不需要初始化, 用于演示初始化顺序
     *
     * @param context
     * @return
     */
    override fun create(context: Context): Any {
        Log.d("CommonModuleInitializer", "call create")
        ARouter.init(context as Application)
        return Any()
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}