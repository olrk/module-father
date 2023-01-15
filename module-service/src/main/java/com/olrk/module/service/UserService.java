package com.olrk.module.service;

import com.olrk.module.pojo.User;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 *
 * @author liaoruikai
 * @date 2023/1/12
 */
@Service
public class UserService {
    public String getDefaultUserName() {
        return User.defaultUser().getName();
    }
}
