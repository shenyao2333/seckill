package com.sy.seckill.order.rabbitmq;

import com.alibaba.fastjson.JSONObject;
import com.rabbitmq.client.Channel;
import com.sy.seckill.common.constants.MQMessage;
import com.sy.seckill.common.constants.RabbitMQConstants;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/19 21:46
 * @description:
 */
@Component
public class InventoryTopicListener {


    @RabbitListener(queues = RabbitMQConstants.TOPIC_INVENTORY_QUEUE)
    public void order(@Payload MQMessage message, @Headers Map<String, Object> headers, Channel channel) throws IOException {
        System.out.println("库存消息："+ message);
        channel.basicAck((Long)headers.get(AmqpHeaders.DELIVERY_TAG),false);
    }


}
