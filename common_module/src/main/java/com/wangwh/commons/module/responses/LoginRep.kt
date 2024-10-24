package com.wangwh.commons.module.responses

/**
 * 作者: wenhui.w
 * 日期: 2024-10-24 14:09
 * 描述:
 */
class LoginRep(
    code: Int,
    message: String,
    val token: String,
    val userId: String,
) : BaseRep(code, message)