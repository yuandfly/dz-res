package com.dz.dzim.exception;


import com.dz.dzim.common.enums.inter.Code;

/**
 * 返回错误码
 *
 * @author yanpanyi
 * @date 2019/3/20
 */
public class ErrorCodeException extends RuntimeException  {

    private Code code;

    public ErrorCodeException(Code code) {
        this.code = code;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }
}
