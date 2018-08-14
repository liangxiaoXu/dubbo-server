package com.dubboServer.listener;

import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.dubboServer.sentine.rule.QpsRule;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuliangxiao on 2018/8/14 19:28
 * 加载限流规则
 */
public class SentinelRulesListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List<FlowRule> rules = new ArrayList<>();

        rules.add(QpsRule.getQpsRule(10));

        FlowRuleManager.loadRules(rules);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

}
