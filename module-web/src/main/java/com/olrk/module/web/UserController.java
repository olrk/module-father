package com.olrk.module.web;

import com.olrk.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author liaoruikai
 * @date 2023/1/12
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/defaultUserName")
    public String getDefaultUserName() {
        return userService.getDefaultUserName();
    }
}
