package com.mongodb.controller;

import com.mongodb.pojo.UserMsg;
import com.mongodb.repository.UserMsgRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by kerns on 2017/4/11.
 */
@Controller
@RequestMapping(value = "/userMsg")
@Api(value = "swagger 测试类", description = "swagger 测试")
public class UserMsgController {
    @Autowired
    private UserMsgRepository userMsgRepository;

    @ApiOperation(value = "添加用户消息", notes = "")
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String add(UserMsg userMsg) {
        userMsgRepository.insert(userMsg);
        return "success";
    }

    @ApiOperation(value = "获取单条用户信息", notes = "")
    @RequestMapping(value = "/findOne", method = RequestMethod.GET)
    @ResponseBody
    public UserMsg findOne(String id) {
        return userMsgRepository.findOne(id);
    }
    @ApiOperation(value = "获取所有用户信息", notes = "")
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<UserMsg> findAll() {
        return userMsgRepository.findAll();
    }



}
