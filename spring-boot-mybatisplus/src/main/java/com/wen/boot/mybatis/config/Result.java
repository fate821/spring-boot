package com.wen.boot.mybatis.config;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 通用响应对象
 */
@Data
@ApiModel(description = "响应对象")
public class Result<T> {
    private static final int SUCCESS_CODE = 0;
    private static final String SUCCESS_MESSAGE = "成功";

    @ApiModelProperty(value = "响应码", name = "code", required = true, example = "" + SUCCESS_CODE)
    private int code;

    @ApiModelProperty(value = "响应消息", name = "msg", required = true, example = SUCCESS_MESSAGE)
    private String msg;

    @ApiModelProperty(value = "响应数据", name = "data")
    private T data;

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private Result() {
        this(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    private Result(int code, String msg) {
        this(code, msg, null);
    }

    private Result(T data) {
        this(SUCCESS_CODE, SUCCESS_MESSAGE, data);
    }

    public static <T> Result<T> success() {
        return new Result<>();
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    public static <T> Result<T> failWithCodeAndMsg(int code, String msg) {
        return new Result<>(code, msg, null);
    }

    public static <T> Result<T> buildWithParam(ResponseParam param) {
        return new Result<>(param.getCode(), param.getMsg(), null);
    }


    public static class ResponseParam {
        private int code;
        private String msg;

        private ResponseParam(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public static ResponseParam buildParam(int code, String msg) {
            return new ResponseParam(code, msg);
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
