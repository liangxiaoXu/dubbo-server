package com.dubboServer.controller;

import com.dubboServer.service.CommonService;
import com.dubboServer.vo.req.UserReq;
import com.dubboServer.vo.res.UserRes;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private CommonService commonService;
    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response){
        logger.info("this is index.html");
        UserRes userRes = commonService.getUser(new UserReq("xiaoming", 0));
        logger.info(userRes.toString());
        return "index";
    }
}
