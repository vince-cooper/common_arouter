package com.wangwh.demo.common_module

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.wangwh.commons.module.base.BaseActivity
import com.wangwh.commons.module.eventbus.LoginEvent
import com.wangwh.commons.module.models.UserModel
import com.wangwh.commons.module.router.RouterIndex
import com.wangwh.demo.common_module.databinding.ActivityLoginBinding
import org.greenrobot.eventbus.EventBus

/**
 * 作者: wenhui.w
 * 日期: 2024-10-24 14:31
 * 描述:
 */
@Route(path = RouterIndex.P_LOGIN, name = "登录页面")
class LoginActivity : BaseActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.successBtn.setOnClickListener {
            val user = UserModel("001", "王文辉", "123456")
            EventBus.getDefault().post(LoginEvent(isSuccess = true, user = user))
            finish()
        }

        binding.failBtn.setOnClickListener {
            EventBus.getDefault().post(LoginEvent(isSuccess = false))
            finish()
        }
    }
}