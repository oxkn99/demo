package com.docker.demo.persistence;

import com.docker.demo.mapper.TestMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class TimeMapperTest {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void testGetTime1() {
        log.info("timeMapper class name: " + testMapper.getClass().getName());
        log.info("timeMapper time: " + testMapper.getTime1());
    }
    //XML 방식
    @Test
    public void testGetTime2() {
        log.info("getTime2");
        log.info("getTime2: " + testMapper.getTime2());
    }
}
