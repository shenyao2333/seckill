package com.sy.seckill.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sy.seckill.goods.domain.ShopGoods;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: shenyao
 * @Date: Created by 2021/5/5 16:21
 * @description: ${description}
 */
public interface ShopGoodsMapper extends BaseMapper<ShopGoods> {



    Integer reduceInventory(@Param("goodsId") Integer goodsId, @Param("inventoryNum") Integer inventoryNum);



    Integer getInventory(@Param("goodsId") Integer goodsId);


}