package com.dubboServer.sentine.rule;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;

/**
 * Created by xuliangxiao on 2018/8/14 19:22
 */
public class QpsRule {


    /**
     * QPS 规则
     * @return
     */
    public static FlowRule getQps10Rule(){
        FlowRule rule = new FlowRule();
        rule.setResource("qps_10");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS );
        rule.setCount( 10 );//set limit QPS
//        rule.setControlBehavior( RuleConstant.CONTROL_BEHAVIOR_DEFAULT );//直接拒绝
//        rule.setControlBehavior( RuleConstant.CONTROL_BEHAVIOR_WARM_UP );//冷启动
//        rule.setControlBehavior( RuleConstant.CONTROL_BEHAVIOR_RATE_LIMITER );//匀速器

        return rule;
    }

}
