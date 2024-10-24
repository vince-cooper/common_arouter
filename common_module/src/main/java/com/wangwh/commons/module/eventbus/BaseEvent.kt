package com.wangwh.commons.module.eventbus

/**
 * 作者: wenhui.w
 * 日期: 2024-10-24 14:24
 * 描述:
 */
open class BaseEvent(
    val sender: String? = null,
    val receiver: String? = null,
)