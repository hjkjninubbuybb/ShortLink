package org.dami.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户持久层对象 (Data Object)
 */
@Data
@TableName("t_user") // 指定映射的数据库表名
public class UserDO {

    /**
     * ID，指定为数据库自增主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private String username;

    /**
     * 密码（该字段在 DTO 中被剔除，保证安全）
     */
    private String password;

    private String realName;

    private String phone;

    private String mail;

    private Long deletionTime;

    /**
     * 插入数据时，由 MyBatis-Plus 自动填充时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 插入或修改数据时，自动更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 逻辑删除标识
     */
    private Integer delFlag;
}