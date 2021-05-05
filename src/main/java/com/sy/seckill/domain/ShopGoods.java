package com.sy.seckill.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/5 16:21
 * @description: ${description}
 */
@ApiModel(value = "com-sy-seckill-domain-ShopGoods")
@Data
@TableName(value = "shop_goods")
public class ShopGoods implements Serializable {
    @TableId(value = "goods_id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer goodsId;

    @TableField(value = "goods_name")
    @ApiModelProperty(value = "")
    private String goodsName;

    @TableField(value = "goods_img")
    @ApiModelProperty(value = "")
    private String goodsImg;

    /**
     * 商品描述
     */
    @TableField(value = "goods_describe")
    @ApiModelProperty(value = "商品描述")
    private String goodsDescribe;

    /**
     * 价格
     */
    @TableField(value = "price")
    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    private static final long serialVersionUID = 1L;
}