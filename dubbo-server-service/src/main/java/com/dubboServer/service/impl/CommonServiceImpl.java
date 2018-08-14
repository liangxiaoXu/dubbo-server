package com.dubboServer.service.impl;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
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
        UserRes userRes = null;
        Entry entry = null;
        try{
            entry = SphU.entry("index");
            userRes = new UserRes(user.getName(), 10);
        }catch( BlockException e ){

        }finally {
            if( entry!= null ){
                entry.exit();
            }
        }
        if( userRes!= null ){
            log.info("return:" + userRes.toString());
        }
        return userRes;
    }

}
