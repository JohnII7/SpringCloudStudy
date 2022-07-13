package com.test.service.impl;

import com.test.entity.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author John117
 * @date 2022/07/13  12:03
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper mapper;

    @Override
    public User getUserById(int uid) {
        return mapper.getUserById(uid);
    }
}

