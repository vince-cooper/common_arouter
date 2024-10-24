package com.wangwh.demo.common_module

import android.annotation.SuppressLint
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.wangwh.commons.module.base.BaseActivity
import com.wangwh.commons.module.eventbus.LoginEvent
import com.wangwh.commons.module.router.RouterIndex
import com.wangwh.demo.common_module.databinding.ActivityMainBinding
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class MainActivity : BaseActivity() {
    override val needEventBus: Boolean = true

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            ARouter.getInstance().build(RouterIndex.P_LOGIN).navigation()
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onLoginEvent(event: LoginEvent) {
        val message = if (event.isSuccess && event.user != null) event.user.toString() else "失败"
        binding.resultTv.text = "结果: $message"
    }
}