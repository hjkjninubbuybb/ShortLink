package org.dami.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dami.shortlink.admin.dao.entity.UserDO;
import org.dami.shortlink.admin.dao.mapper.UserMapper;
import org.dami.shortlink.admin.dto.resp.UserRespDTO;
import org.dami.shortlink.admin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * 用户接口实现层
 */

@Service // 1. 告诉 Spring 框架：我是业务逻辑类
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    @Override
    public UserRespDTO getUserByUsername(String username) {
        // 2. 构建查询条件：WHERE username = '传入的username'
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                .eq(UserDO::getUsername, username);

        // 3. 执行查询：baseMapper 是 MyBatis-Plus 提供的，直接去数据库查
        UserDO userDO = baseMapper.selectOne(queryWrapper);

        // 4. 数据转换：
        // 创建一个空的返回盒 (UserRespDTO)
        UserRespDTO result = new UserRespDTO();
        // 将查到的数据库数据 (userDO) 里的字段值，自动塞进返回盒里
        BeanUtils.copyProperties(userDO, result);

        // 5. 将装好数据的盒子返回
        return result;
    }
}
