package com.sy.seckill.goods.service.impi;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sy.seckill.goods.mapper.UserMapper;
import com.sy.seckill.goods.domain.User;
import com.sy.seckill.goods.service.UserService;
/**
 * @Author: shenyao
 * @Date: Created by 2021/5/5 16:21
 * @description: ${description}
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
