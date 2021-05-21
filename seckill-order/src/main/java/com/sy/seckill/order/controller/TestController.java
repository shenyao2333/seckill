package com.sy.seckill.order.controller;

import com.sy.seckill.common.compose.Limit;
import com.sy.seckill.common.compose.LogRecord;
import com.sy.seckill.common.web.GlobalExceptionHandler;
import com.sy.seckill.common.web.GrabException;
import com.sy.seckill.common.web.R;
import com.sy.seckill.order.domain.Goods;
import com.sy.seckill.order.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sy
 * @Date: Created by 2021/5/19 11:17
 * @description:
 */
@RestController
@AllArgsConstructor
public class TestController {

    private final TestService testService;


    @Limit(period=10,count = 1,key = "test#userId")
    @GetMapping("/test1")
    public R test1(String userId){
        return R.ok("成功！！");
    }




    @GetMapping("/test2")
    @LogRecord(msg = "测试")
    public R test2(Goods goods){
        testService.test2(goods);
        return R.ok("成功！！");
    }


}
