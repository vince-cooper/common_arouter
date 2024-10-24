package com.wangwh.commons.module.eventbus

/**
 * 作者: wenhui.w
 * 日期: 2024-10-24 14:20
 * 描述:
 */
class MessageEvent(
    sender: String? = null,
    receiver: String? = null,
    val message: String,
) : BaseEvent(sender, receiver)