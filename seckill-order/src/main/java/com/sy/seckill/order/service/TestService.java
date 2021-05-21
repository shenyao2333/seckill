package com.sy.seckill.order.service;

import com.sy.seckill.order.domain.Goods;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author: sy
 * @Date: Created by 2021/5/21 17:46
 * @description:
 */
@Service
public class TestService {





    public void test1(){

    }


    //@Cacheable(value = "test",key = "#goods.name")
    public void test2(Goods goods) {

        System.out.println("进来了sd---");
    }


}
