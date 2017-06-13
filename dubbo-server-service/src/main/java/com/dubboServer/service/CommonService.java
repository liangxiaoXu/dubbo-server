package com.dubboServer.service;

import com.dubboServer.vo.req.UserReq;
import com.dubboServer.vo.res.UserRes;

/**
 * Created by xuliangxiao on 2017/6/12 17:50
 */
public interface CommonService {

    UserRes getUser(UserReq user);

}