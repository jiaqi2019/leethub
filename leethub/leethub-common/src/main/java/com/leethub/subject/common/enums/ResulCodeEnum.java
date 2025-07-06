package com.leethub.subject.common.enums;

import lombok.Getter;

@Getter
public enum ResulCodeEnum {
    SUCCESS(200, "success"),
    FAIL(500, "fail");

    public int code;
    public String desc;

    ResulCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ResulCodeEnum getByCode(int codeVal) {
        for (ResulCodeEnum result : ResulCodeEnum.values()) {
            if (result.code == codeVal) {
                return result;
            }
        }
        return null;
    }
}
