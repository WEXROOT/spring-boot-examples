package com.leone.security.service;

import com.leone.security.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author leone
 * @since 2018-10-30
 **/
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public boolean login(String account, String password) {
        return userMapper.login(account, password).size() > 0;
    }


}
