package com.sy.seckill.common.compose;

import java.lang.annotation.*;

/**
 * @Author: sy
 * @Date: Created by 2021/5/21 15:59
 * @description: 日志记录
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
@Inherited
public @interface LogRecord {


    /**
     * 日志描述
     *
     */
    String msg() default "";






}
