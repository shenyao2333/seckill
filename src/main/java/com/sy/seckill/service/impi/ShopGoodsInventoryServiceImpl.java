package com.sy.seckill.service.impi;

import com.sy.seckill.service.ShopGoodsInventoryService;
import org.springframework.cache.annotation.Cacheable;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/9 19:57
 * @description:
 */
public class ShopGoodsInventoryServiceImpl implements ShopGoodsInventoryService {


    @Override
    @Cacheable(value = "shopsGoods#6000", key = "#goodsId")
    public Integer getInventoryByGoodsId(Integer goodsId) {
        return null;
    }


    @Override
    public Boolean reduceInventory(Integer goodsId, Integer inventory) {

        return null;
    }
}
