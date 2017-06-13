package com.dubboServer.service.impl;

import com.dubboServer.service.CommonService;
import com.dubboServer.vo.req.UserReq;
import com.dubboServer.vo.res.UserRes;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 * Created by xuliangxiao on 2017/6/13 12:46
 */
@Service("commonService")
class CommonServiceImpl implements CommonService {
    private Log log = LogFactory.getLog(CommonServiceImpl.class);

    @Override
    public UserRes getUser(UserReq user) {
        log.info("param:" + user.toString());
        UserRes userRes = new UserRes(user.getName(), 10);
        return userRes;
    }

}
