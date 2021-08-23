package com.docker.demo.service;

import com.docker.demo.domain.UserVO;

import java.util.List;

public interface UserService {
    List<UserVO> getUserAllList();
}
