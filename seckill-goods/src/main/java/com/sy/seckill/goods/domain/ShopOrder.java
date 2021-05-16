package com.sy.seckill.goods.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/5 16:21
 * @description: ${description}
 */

/**
 * 订单表
 */
@Data
@ApiModel(value = "ShopOrder")
@TableName(value = "shop_order")
public class ShopOrder implements Serializable {


    @TableId(value = "order_id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long orderId;

    @TableField(value = "user_id")
    @ApiModelProperty(value = "")
    private Integer userId;

    /**
     * 订单号
     */
    @TableField(value = "order_sn")
    @ApiModelProperty(value = "订单号")
    private String orderSn;

    /**
     * 商品种数
     */
    @TableField(value = "goods_species")
    @ApiModelProperty(value = "商品种数")
    private Integer goodsSpecies;

    /**
     * 原价
     */
    @TableField(value = "order_price")
    @ApiModelProperty(value = "原价")
    private BigDecimal orderPrice;

    /**
     * 支付价格
     */
    @TableField(value = "paid_price")
    @ApiModelProperty(value = "支付价格")
    private BigDecimal paidPrice;

    /**
     * 优惠价格
     */
    @TableField(value = "discount__price")
    @ApiModelProperty(value = "优惠价格")
    private BigDecimal discountPrice;

    /**
     * 状态，0-未支付，1-支付（待发货），2-待收货，3-确定收货（待评论），4-订单完成
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value = "状态，0-未支付，1-支付（待发货），2-待收货，3-确定收货（待评论），4-订单完成")
    private Short status;

    /**
     * 下单时间
     */
    @TableField(value = "place_time")
    @ApiModelProperty(value = "下单时间")
    private Date placeTime;

    /**
     * 支付时间
     */
    @TableField(value = "pay_time")
    @ApiModelProperty(value = "支付时间")
    private Date payTime;

    /**
     * 完成时间
     */
    @TableField(value = "finish_time")
    @ApiModelProperty(value = "完成时间")
    private Date finishTime;

    /**
     * 备注
     */
    @TableField(value = "remarks")
    @ApiModelProperty(value = "备注")
    private String remarks;

    /**
     * 创建时间
     */
    @TableField(value = "created")
    @ApiModelProperty(value = "创建时间")
    private Date created;

    private static final long serialVersionUID = 1L;
}