package com.transfar.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4jController {

    private static final Logger logger = LogManager.getLogger(Log4jController.class);

    /**
     * 方便测试，用了get请求
     * @param username 登录名称
     */
    @GetMapping("/a")
    public String log4j(String username){
        System.out.println(username);
        // 打印登录名称
        logger.info(username);
        return "a";
    }
}
