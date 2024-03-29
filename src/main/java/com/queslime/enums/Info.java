package com.queslime.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Info {
    // Public: Uid
    UID_ILLEGAL(100, "用户UID非法"),
    UID_NOT_EXISTS(101, "用户不存在"),
    // Public: Not null
    UID_NULL(110, "UID不能为空"),
    EMAIL_NULL(111, "邮箱不能为空"),
    PWD_NULL(112, "密码不能为空"),
    USER_NAME_NULL(113, "用户名不能为空"),
    // Public: Duplicate
    EMAIL_DUPLICATE(120, "邮箱已被使用"),
    USER_NAME_DUPLICATE(121, "用户名重复"),
    // Public: Success or Fail
    SUCCESS(200, "成功"),
    FAIL(201, "失败"),
    // Register
    EMAIL_ILLEGAL(210, "非法邮箱格式"),
    EMAIL_TOO_LONG(211, "邮箱长度过长"),
    PWD_ILLEGAL(212,"密码长度应在6到20位之间，且至少包含一个字母和一个数字"),
    // Activate
    ALREADY_ACTIVATED(220, "账号已经激活过了"),
    EMAIL_SEND(221, "邮件成功发送");
    // Update

    private final int code;
    private final String msg;

    Info(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
