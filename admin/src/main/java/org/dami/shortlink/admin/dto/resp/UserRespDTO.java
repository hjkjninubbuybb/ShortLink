package org.dami.shortlink.admin.dto.resp;

import lombok.Data; // 来自 Lombok：自动生成 Getter/Setter/ToString
import java.time.LocalDateTime;

/**
 * 用户返回参数响应 (Data Transfer Object)
 * 作用：屏蔽数据库敏感字段（如密码），只给前端需要的数据
 */
@Data
public class UserRespDTO {

    private Long id;

    private String username;

    private String realName;

    private String phone;

    private String mail;

    /**
     * 注销时间戳（Long 类型通常用于前后端传递时间戳）
     */
    private Long deletionTime;

    /**
     * 创建时间（使用 Java 8 新日期 API）
     */
    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 逻辑删除标识
     */
    private Integer delFlag;
}