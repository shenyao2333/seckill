package com.sy.seckill.goods.service.impi;

import com.sy.seckill.goods.service.ShopGoodsInventoryService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/9 19:57
 * @description:
 */
@Service
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
