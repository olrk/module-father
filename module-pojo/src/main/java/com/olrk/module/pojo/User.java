package com.olrk.module.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户
 *
 * @author liaoruikai
 * @date 2023/1/12
 */
@Data
@AllArgsConstructor
public class User {
    private static final User DEFAULT_USER = new User("张三", "中国");

    private String name;
    private String country;

    public static User defaultUser() {
        return DEFAULT_USER;
    }
}
