package com.docker.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface TestMapper {

    @Select("select now() as TEST")
    public String getTime1();

    public String getTime2();
}
