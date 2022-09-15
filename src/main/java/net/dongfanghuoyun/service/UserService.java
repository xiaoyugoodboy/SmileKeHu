package net.dongfanghuoyun.service;

import net.dongfanghuoyun.entity.User;

/**
 * @author Smile
 * @date 2022/7/16 19:21
 */
public interface UserService {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
