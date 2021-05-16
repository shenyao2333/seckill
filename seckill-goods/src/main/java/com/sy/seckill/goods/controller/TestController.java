package com.sy.seckill.goods.controller;

import com.alibaba.fastjson.JSONObject;

import com.google.common.util.concurrent.RateLimiter;
import com.sy.seckill.common.constants.RabbitMQConstants;
import com.sy.seckill.common.web.R;
import com.sy.seckill.goods.rabbitmq.MQMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

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


    private int i =1;

    private  RateLimiter rateLimiter = RateLimiter.create(50, 1, TimeUnit.SECONDS);

    @GetMapping("/testLimiter")
    public R testLimiter(){
        boolean b = rateLimiter.tryAcquire();
        if (b){
            return R.ok();
        }
        i++;
        System.out.println("限流了"+i);
        return R.fail("限流！！！！"+i);
    }




}
