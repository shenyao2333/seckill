package com.sy.seckill.config;

import com.sy.seckill.constants.RabbitMQConstants;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/5 17:37
 * @description: mq队列配置
 */
@Component
public class RabbitMQConfig {

    @Bean
    Queue orderQueue(){
        return new Queue(RabbitMQConstants.TOPIC_ORDER_QUEUE,true);
    }

    /**
     * 声明一个（交换机
     * 参数说明：
     * 1、第一个为交换器名
     * 2、是否持久化，默认true
     * 3、消费者断开时是否删除
     * 4、还可以加一个消息其他参数    实际开发需要持久化，只需要输入交换器的名称，其他用默认的
     * @return
     */
    @Bean
    TopicExchange orderExchange(){
        return new TopicExchange(RabbitMQConstants.EXCHANGE_TOPIC_ORDER,true,false);
    }


    /**
     *
     * @param queue
     * @param topicExchange
     * @return
     */
    @Bean
    Binding fanoutQue1(@Qualifier("orderQueue") Queue queue,@Qualifier("orderExchange")  TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(RabbitMQConstants.ROUTING_TOPIC_ORDER);
    }








}
