package org.dami.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService; // 来自 MyBatis-Plus：通用 Service 基类
import org.dami.shortlink.admin.dao.entity.UserDO;
import org.dami.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 * 继承 IService<UserDO> 后，自动拥有了基础的增删改查方法
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 返回专门用于展示的 DTO 对象，而不是数据库实体
     */
    UserRespDTO getUserByUsername(String username);
}