package org.dami.shortlink.admin.controller;

import lombok.RequiredArgsConstructor; // 来自 Lombok：自动注入构造函数
import org.dami.shortlink.admin.dto.resp.UserRespDTO;
import org.dami.shortlink.admin.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制层
 */
@RestController // 来自 Spring：声明这是 REST 风格的控制器
@RequiredArgsConstructor
public class UserController {

    // 注入 Service 接口，通过它去调用业务逻辑
    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     * 请求路径：/api/shortlink/v1/user/{username}
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public UserRespDTO getUserByUsername(@PathVariable String username) {
        // 实际上线时，这里会调用真正的 Service 方法
        return userService.getUserByUsername(username);
    }
}