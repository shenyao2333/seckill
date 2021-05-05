package com.sy.seckill.controller;

import com.alibaba.fastjson.JSONObject;
import com.sy.seckill.constants.RabbitMQConstants;
import com.sy.seckill.rabbitmq.MQMessage;
import com.sy.seckill.web.R;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/5 16:21
 * @description: 测试运行
 */
@RestController
@RequestMapping("/test1")
@RequiredArgsConstructor
public class TestController  {

    private final RabbitTemplate rabbitTemplate;

    @GetMapping("/test")
    public R test(){
        return R.ok("成功了！");
    }


    @GetMapping("/testMQ")
    public R testMQ(){
        HashMap<String, Object> data = new HashMap<>(10);
        data.put("123","234");
        MQMessage message = MQMessage.builder()
                .messageId(234234234L)
                .message(new JSONObject(data))
                .build();
        rabbitTemplate.convertAndSend(RabbitMQConstants.EXCHANGE_TOPIC_ORDER,RabbitMQConstants.ROUTING_TOPIC_ORDER,message);
        return R.ok("成功了！");
    }


}
