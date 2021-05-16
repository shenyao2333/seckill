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
 * 订单里的商品信息表
 */
@ApiModel(value = "com-sy-seckill-domain-ShopOrderGoods")
@Data
@TableName(value = "shop_order_goods")
public class ShopOrderGoods implements Serializable {
    @TableId(value = "og_id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer ogId;

    @TableField(value = "order_id")
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
     * 商品数量
     */
    @TableField(value = "goods_num")
    @ApiModelProperty(value = "商品数量")
    private Integer goodsNum;

    /**
     * 原价
     */
    @TableField(value = "goods_price")
    @ApiModelProperty(value = "原价")
    private BigDecimal goodsPrice;

    /**
     * 结算价格
     */
    @TableField(value = "settle_price")
    @ApiModelProperty(value = "结算价格")
    private BigDecimal settlePrice;

    /**
     * 优惠价格
     */
    @TableField(value = "sale__price")
    @ApiModelProperty(value = "优惠价格")
    private BigDecimal salePrice;

    /**
     * 总价（数量*结算价格）
     */
    @TableField(value = "total_prices")
    @ApiModelProperty(value = "总价（数量*结算价格）")
    private BigDecimal totalPrices;

    /**
     * 状态，0-未支付，1-支付（待发货），2-待收货，3-确定收货（待评论），4-订单完成
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value = "状态，0-未支付，1-支付（待发货），2-待收货，3-确定收货（待评论），4-订单完成")
    private Short status;

    /**
     * 备注
     */
    @TableField(value = "remarks")
    @ApiModelProperty(value = "备注")
    private String remarks;

    /**
     * 商品id
     */
    @TableField(value = "goods_id")
    @ApiModelProperty(value = "商品id")
    private Integer goodsId;

    /**
     * 商品图片
     */
    @TableField(value = "goods_img")
    @ApiModelProperty(value = "商品图片")
    private String goodsImg;

    /**
     * 创建时间
     */
    @TableField(value = "created")
    @ApiModelProperty(value = "创建时间")
    private Date created;

    private static final long serialVersionUID = 1L;
}