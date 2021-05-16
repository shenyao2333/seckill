package com.sy.seckill.goods.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/5 16:21
 * @description: ${description}
 */
@ApiModel(value = "com-sy-seckill-domain-User")
@Data
@TableName(value = "`user`")
public class User implements Serializable {
    @TableId(value = "user_id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer userId;

    @TableField(value = "user_name")
    @ApiModelProperty(value = "")
    private String userName;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    @ApiModelProperty(value = "昵称")
    private String nickname;

    @TableField(value = "mobile")
    @ApiModelProperty(value = "")
    private String mobile;

    @TableField(value = "`password`")
    @ApiModelProperty(value = "")
    private String password;

    /**
     * 头像
     */
    @TableField(value = "buddha")
    @ApiModelProperty(value = "头像")
    private String buddha;

    /**
     * 0-女，1-男，2-未知
     */
    @TableField(value = "sex")
    @ApiModelProperty(value = "0-女，1-男，2-未知")
    private Short sex;

    /**
     * 出生年
     */
    @TableField(value = "birth_year")
    @ApiModelProperty(value = "出生年")
    private String birthYear;

    /**
     * 出生月
     */
    @TableField(value = "birth_month")
    @ApiModelProperty(value = "出生月")
    private String birthMonth;

    /**
     * 出生日
     */
    @TableField(value = "birth_day")
    @ApiModelProperty(value = "出生日")
    private String birthDay;

    /**
     * 省
     */
    @TableField(value = "province")
    @ApiModelProperty(value = "省")
    private String province;

    /**
     * 市
     */
    @TableField(value = "town")
    @ApiModelProperty(value = "市")
    private String town;

    /**
     * 县
     */
    @TableField(value = "county")
    @ApiModelProperty(value = "县")
    private String county;

    /**
     * 详细地址
     */
    @TableField(value = "address")
    @ApiModelProperty(value = "详细地址")
    private String address;

    /**
     * 创建时间
     */
    @TableField(value = "created")
    @ApiModelProperty(value = "创建时间")
    private Date created;

    private static final long serialVersionUID = 1L;
}