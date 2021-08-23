package com.docker.demo.service;

import com.docker.demo.domain.BoardVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> boardAllList();
}
