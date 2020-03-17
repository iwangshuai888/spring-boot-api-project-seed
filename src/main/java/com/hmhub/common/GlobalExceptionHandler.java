package com.hmhub.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebResult;
import javax.servlet.http.HttpServletResponse;

/**
 * 统一异常处理
 *
 * @author WangShuai
 * @date 2020/3/17 18:19
 */
@log4j2
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(NullPointerException.class)
    public BaseResult globalException(HttpServletResponse response, NullPointerException ex) {


        log.info("GlobalExceptionHandler...");
        log.info("错误代码：" + response.getStatus());
        BaseResult result = new WebResult(WebResult.RESULT_FAIL, "request error:" + response.getStatus()
                , "GlobalExceptionHandler:" + ex.getMessage());
        return result;
    }

}
