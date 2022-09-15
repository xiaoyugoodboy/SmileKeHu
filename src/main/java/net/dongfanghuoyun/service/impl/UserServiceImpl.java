package net.dongfanghuoyun.service.impl;

import net.dongfanghuoyun.entity.User;
import net.dongfanghuoyun.service.UserService;

/**
 * @author Smile
 * @date 2022/7/16 19:34
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setAge(18);
        user.setSex("男");
        return user;
    }
}
