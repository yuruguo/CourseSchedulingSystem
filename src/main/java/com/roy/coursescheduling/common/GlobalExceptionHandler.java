package com.roy.coursescheduling.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ROY
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    // 对所有的异常进行相同的处理
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ServerResponse error(Exception e) {
        e.printStackTrace();
        LOG.error("the error message is:" + "    " + e.getMessage());
        return ServerResponse.ofError("服务器出现异常");
    }

}
