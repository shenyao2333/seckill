package com.sy.seckill.constants;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/5 16:42
 * @description: 消息队列配置
 */
public interface RabbitMQConstants {

    /**
     * 列队
     */
    String TOPIC_ORDER_QUEUE="topic.order";

    /**
     * 交换机
     */
    String EXCHANGE_TOPIC_ORDER = "order";

    String ROUTING_TOPIC_ORDER="topic.order";










}
