package com.docker.demo.service.impl;

import com.docker.demo.domain.BoardVO;
import com.docker.demo.mapper.BoardMapper;
import com.docker.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardMapper boardMapper;
    @Override
    public List<BoardVO> boardAllList() {
        return boardMapper.selectBoardAll();
    }
}
