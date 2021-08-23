package com.docker.demo.controller;


import com.docker.demo.domain.BoardVO;
import com.docker.demo.domain.UserVO;
import com.docker.demo.service.BoardService;
import com.docker.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    UserService userService;

    @Autowired
    BoardService boardService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home() throws Exception {

        return "Hello Doker World!!";
    }

    @RequestMapping(value = "/userList",method = RequestMethod.GET)
    public List<UserVO> getUserList() throws Exception{
        return userService.getUserAllList();
    }

    @RequestMapping(value = "/boardList",method = RequestMethod.GET)
    public List<BoardVO> getBoardList() throws Exception{
        System.out.println(boardService.boardAllList().toString());
        return boardService.boardAllList();
    }
}
