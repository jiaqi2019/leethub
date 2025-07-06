package com.leethub.subject.common.entity;

import lombok.Data;
import com.leethub.subject.common.enums.ResulCodeEnum;

@Data
public class Result<T> {
    private Boolean success;
    private String message;
    private Integer code;
    private T data;

    public static Result ok() {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResulCodeEnum.SUCCESS.getCode());
        result.setMessage(ResulCodeEnum.SUCCESS.getDesc());
        return result;
    }


    public static <T> Result ok(T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResulCodeEnum.SUCCESS.getCode());
        result.setMessage(ResulCodeEnum.SUCCESS.getDesc());
        result.setData(data);
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResulCodeEnum.FAIL.getCode());
        result.setMessage(ResulCodeEnum.FAIL.getDesc());
        return result;
    }

    public static <T>  Result fail(T data) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResulCodeEnum.FAIL.getCode());
        result.setMessage(ResulCodeEnum.FAIL.getDesc());
        result.setData(data);
        return result;
    }

}
