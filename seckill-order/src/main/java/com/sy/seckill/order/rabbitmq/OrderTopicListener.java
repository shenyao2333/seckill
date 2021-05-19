package com.sy.seckill.order.rabbitmq;

import com.alibaba.fastjson.JSONObject;
import com.rabbitmq.client.Channel;
import com.sy.seckill.common.constants.MQMessage;
import com.sy.seckill.common.constants.RabbitMQConstants;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/5 16:32
 * @description: 订单列队监听
 */
@Component
public class OrderTopicListener {



    @RabbitListener(queues = RabbitMQConstants.TOPIC_ORDER_QUEUE)
    public void order(@Payload MQMessage message,   @Headers Map<String, Object> headers, Channel channel) throws IOException {
        System.out.println("普通消息进来："+ message);
        channel.basicAck((Long)headers.get(AmqpHeaders.DELIVERY_TAG),false);
    }


    @RabbitListener(queues = RabbitMQConstants.TOPIC_ORDER_DEAD_LETTER_QUEUE)
    public void dLOrder(@Payload MQMessage message, @Headers Map<String, Object> headers, Channel channel) throws IOException {
        System.out.println("死信消息进来："+ message);
        channel.basicAck((Long)headers.get(AmqpHeaders.DELIVERY_TAG),false);
    }





}
