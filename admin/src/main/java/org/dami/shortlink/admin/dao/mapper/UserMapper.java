package org.dami.shortlink.admin.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper; // 来自 MyBatis-Plus
import org.dami.shortlink.admin.dao.entity.UserDO;

/**
 * 用户持久层 Mapper 接口
 * 只要继承 BaseMapper，就自动拥有了对 t_user 表的单表 CRUD 能力
 */
public interface UserMapper extends BaseMapper<UserDO> {
}