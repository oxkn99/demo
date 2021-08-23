package com.docker.demo.service.impl;

import com.docker.demo.domain.UserVO;
import com.docker.demo.mapper.UserMapper;
import com.docker.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<UserVO> getUserAllList() {
        return userMapper.selectUserAll();
    }
}
