package com.sy.seckill.goods.service;



/**
 * @Author: shenyao
 * @Date: Created by 2021/5/9 19:43
 * @description: 商品库存
 */
public interface ShopGoodsInventoryService {


    Integer getInventoryByGoodsId(Integer goodsId);

    /**
     * 减库存
     * @return
     */
    Boolean reduceInventory(Integer goodsId,Integer inventory);






}
