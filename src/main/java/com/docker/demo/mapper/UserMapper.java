package com.docker.demo.mapper;

import com.docker.demo.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from demo.user")
    public List<UserVO> selectUserAll();

}
