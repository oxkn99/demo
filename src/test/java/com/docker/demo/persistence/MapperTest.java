package com.docker.demo.persistence;

import com.docker.demo.mapper.BoardMapper;
import com.docker.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class MapperTest {
    @Autowired
    UserMapper userMapper;

    @Autowired
    BoardMapper boardMapper;

    @Test
    public void testGetUser() {
        log.info("###result: " + userMapper.selectUserAll().toString());
    }

    @Test
    public void tsetGetBoard(){
        log.info("###result: " + boardMapper.selectBoardAll().toString());
    }

}
