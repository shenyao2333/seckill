package com.sy.seckill.common.config;

import com.sy.seckill.common.constants.RabbitMQConstants;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/5 17:37
 * @description: mq队列配置
 */
@Component
public class RabbitMQConfig {


    @Bean
    public  Queue orderQueue(){
        Map<String,Object> xLMap = new HashMap<String,Object>(2){
            {
                put("x-dead-letter-exchange",RabbitMQConstants.EXCHANGE_TOPIC_DEAD_LETTER);
                put("x-dead-letter-routing-key",RabbitMQConstants.ROUTING_TOPIC_DEAD_LETTER_ORDER);
            }
        };
        return new Queue(RabbitMQConstants.TOPIC_ORDER_QUEUE,true,false,false,xLMap);
    }


    @Bean
    public  Queue inventoryQueue(){
        return new Queue(RabbitMQConstants.TOPIC_INVENTORY_QUEUE,true,false,false);
    }

    /**
     * 死信订单列队
     * @return
     */
    @Bean
    public  Queue deadOrderQueue(){
        return new Queue(RabbitMQConstants.TOPIC_ORDER_DEAD_LETTER_QUEUE,true,false,false);
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
    public TopicExchange orderExchange(){
        return new TopicExchange(RabbitMQConstants.EXCHANGE_TOPIC_ORDER,true,false);
    }

    /**
     * 死信交换机
     * @return
     */
    @Bean
    public TopicExchange deadExchange() {
        return new TopicExchange(RabbitMQConstants.EXCHANGE_TOPIC_DEAD_LETTER,true,false);
    }

    @Bean
    public TopicExchange inventoryExchange() {
        return new TopicExchange(RabbitMQConstants.EXCHANGE_TOPIC_INVENTORY,true,false);
    }



    @Bean
    public Binding bindingOrder(@Qualifier("orderQueue") Queue queue,@Qualifier("orderExchange")  TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(RabbitMQConstants.ROUTING_TOPIC_ORDER);
    }


    @Bean
    public  Binding bindingDeadOrder(@Qualifier("deadOrderQueue") Queue queue, @Qualifier("deadExchange") TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(RabbitMQConstants.ROUTING_TOPIC_DEAD_LETTER_ORDER);
    }


    @Bean
    public  Binding bindingInventoryOrder(@Qualifier("inventoryQueue") Queue queue, @Qualifier("inventoryExchange") TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(RabbitMQConstants.ROUTING_INVENTORY_ORDER);
    }


}
