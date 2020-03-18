package com.hmhub.common.error;


import com.hmhub.common.SystemException;

/**
 * @author xiehao
 * @date 2019-07-29
 */

public enum CommonErrorCodeEnum {

    // 通用异常错误码
    ERROR_10001(10001L, "错误码取值范围不正确"),
    ERROR_10002(10002L, "参数校验没通过"),
    ERROR_10003(10003L, "没有登录"),
    ERROR_10004(10004L, "请求参数不是标准JSON对象格式"),
    ERROR_10005(10005L, "系统错误"),
    ERROR_10006(10006L, "请求方式有误"),
    ERROR_10007(10007L, "请求参数不是标准JSON数组格式"),
    ERROR_10008(10008L, "访问的资源不存在"),
    ERROR_10009(10009L, "微服务调用异常"),
    ERROR_10010(10010L, "子房型不存在"),
    ERROR_10011(10011L, "子酒店不存在"),
    ERROR_10012(10012L, "母房型不存在"),
    ERROR_10013(10013L, "未获取到用户信息");

    public long code;
    public String message;


    /**
     * @param code 10001 ~ 20000
     */
    CommonErrorCodeEnum(Long code, String message) {
        if (code < 10001 || code > 20000) {
            throw new SystemException(10001L, "错误码取值范围不正确");
        }
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return code + "_" + message;
    }
}
