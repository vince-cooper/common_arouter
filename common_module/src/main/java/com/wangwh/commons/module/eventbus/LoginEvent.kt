package com.wangwh.commons.module.eventbus

import com.wangwh.commons.module.models.UserModel

/**
 * 作者: wenhui.w
 * 日期: 2024-10-24 14:25
 * 描述:
 */
class LoginEvent(
    sender: String? = null,
    receiver: String? = null,
    val isSuccess: Boolean,
    val user: UserModel? = null,
) : BaseEvent()