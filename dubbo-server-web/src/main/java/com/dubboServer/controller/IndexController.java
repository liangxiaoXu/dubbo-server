package com.dubboServer.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xuliangxiao on 2017/6/12 14:40
 */
@Controller
public class IndexController {
    private static Log logger = LogFactory.getLog(IndexController.class);

    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response){
        logger.info("this is index.html");
        return "index";
    }
}
