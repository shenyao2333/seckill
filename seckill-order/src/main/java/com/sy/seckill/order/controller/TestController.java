package com.sy.seckill.order.controller;

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


    @GetMapping("/test1")
    public R test1(){
        return R.ok("成功！！");
    }




}
