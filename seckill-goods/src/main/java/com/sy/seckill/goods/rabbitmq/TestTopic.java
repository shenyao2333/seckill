package com.sy.seckill.goods.rabbitmq;

import com.rabbitmq.client.Channel;
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
 * @Date: Created by 2021/5/5 16:32
 * @description: 测试消息消费等问题
 */
@Component
public class TestTopic {



    @RabbitListener(queues = RabbitMQConstants.TOPIC_ORDER_QUEUE)
    public void test1(@Payload MQMessage message, @Headers Map<String, Object> headers, Channel channel) throws IOException {
        System.out.println("消息进来："+ message);
        channel.basicAck((Long)headers.get(AmqpHeaders.DELIVERY_TAG),false);
    }





}
