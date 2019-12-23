package com.alibaba.csp.sentinel.dashboard.rule.nacos.gateway;

import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayFlowRule;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayParamFlowItem;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.gateway.GatewayParamFlowItemEntity;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRule;

/**
 * 网关流控规则类
 *
 * @author tam
 */
public class GatewatParamFlowRule extends ParamFlowRule {
    private long intervalSec = 1;
    private GatewayParamFlowItemEntity paramItem;

    public long getIntervalSec() {
        return intervalSec;
    }

    public void setIntervalSec(long intervalSec) {
        this.intervalSec = intervalSec;
    }

    public GatewayParamFlowItemEntity getParamItem() {
        return paramItem;
    }

    public void setParamItem(GatewayParamFlowItemEntity paramItem) {
        this.paramItem = paramItem;
    }

    @Override
    public String toString() {
        return "ParamFlowRule{" +
                "grade=" + super.getGrade() +
                ", paramIdx=" + super.getParamIdx() +
                ", count=" + super.getCount() +
                ", controlBehavior=" + super.getControlBehavior() +
                ", maxQueueingTimeMs=" + super.getMaxQueueingTimeMs() +
                ", burstCount=" + super.getBurstCount() +
                ", durationInSec=" + super.getDurationInSec() +
                ", paramFlowItemList=" + super.getParamFlowItemList() +
                ", clusterMode=" + super.isClusterMode() +
                ", clusterConfig=" + super.getClusterConfig() +
                ", paramItem=" + paramItem +
                ", intervalSec=" + intervalSec +
                '}';
    }

}
