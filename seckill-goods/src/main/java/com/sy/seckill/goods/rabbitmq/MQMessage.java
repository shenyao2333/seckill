package com.sy.seckill.goods.rabbitmq;

import com.alibaba.fastjson.JSONObject;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sy
 * Date: 2019/11/25 11:35
 * @Description MQ消息实体
 */
@Data
@Builder
public class MQMessage implements Serializable {

    private static final long serialVersionUID = 4426149459382531256L;

    /**
     * 消息id
     */
    private Long messageId;
    /**
     * 消息体
     */
    private JSONObject message;

}
