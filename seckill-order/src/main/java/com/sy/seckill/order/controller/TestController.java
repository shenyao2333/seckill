package com.sy.seckill.order.controller;

import com.sy.seckill.common.compose.Limit;
import com.sy.seckill.common.web.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sy
 * @Date: Created by 2021/5/19 11:17
 * @description:
 */
@RestController
public class TestController {


    @Limit(period=10,count = 1,key = "test#userId")
    @GetMapping("/test1")
    public R test1(String userId){
        return R.ok("成功！！");
    }




}
