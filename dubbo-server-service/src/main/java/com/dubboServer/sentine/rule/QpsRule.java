package com.dubboServer.sentine.rule;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;

/**
 * Created by xuliangxiao on 2018/8/14 19:22
 */
public class QpsRule {


    /**
     * QPS 规则
     * @param qps 每秒可通过的次数
     * @return
     */
    public static FlowRule getQpsRule( int qps ){
        FlowRule rule = new FlowRule();
        rule.setResource("index");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS );
        rule.setCount( qps );//set limit QPS
        return rule;
    }

}
