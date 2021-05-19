package com.sy.seckill.common.constants;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/5 16:42
 * @description: 消息队列配置
 */
public interface RabbitMQConstants {


    /**
     * 订单交换机
     */
    String EXCHANGE_TOPIC_ORDER = "order";

    /**
     * 死信交换机
     */
    String EXCHANGE_TOPIC_DEAD_LETTER  = "topicDeadLetter";

    /**
     * 死信交换机
     */
    String EXCHANGE_TOPIC_INVENTORY  = "inventory";



    /**
     * 列队
     */
    String TOPIC_ORDER_QUEUE="topic.order";

    /**
     * 库存列队
     */
    String TOPIC_INVENTORY_QUEUE="topic.inventory";


    /**
     * 订单的死信列队
     */
    String TOPIC_ORDER_DEAD_LETTER_QUEUE="dl.topic.order";



    /**
     * 订单routingKey
     */
    String ROUTING_TOPIC_ORDER="topic.order";


    /**
     * 库存routingKey
     */
    String ROUTING_INVENTORY_ORDER="topic.inventory";


    /**
     * 死信订单routingKey
     */
    String ROUTING_TOPIC_DEAD_LETTER_ORDER="dl.topic.order";














}
