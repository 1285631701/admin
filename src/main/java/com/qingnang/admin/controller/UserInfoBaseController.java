package com.qingnang.admin.controller;

import com.qingnang.admin.entity.UserInfoBase;
import com.qingnang.admin.service.UserInfoBaseService;
import com.qingnang.admin.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController//等于 @Controller + @ResponseBody
@CrossOrigin//跨域
public class UserInfoBaseController {
    @Autowired
    private UserInfoBaseService userInfoBaseService;

    @PostMapping("/user/add.do")
    public ResultVo add(@RequestBody UserInfoBase userInfoBase){

        return userInfoBaseService.saveUser(userInfoBase);
    }

    @PostMapping("/user/search.do")
    public ResultVo search(@RequestBody UserInfoBase userInfoBase){

        return userInfoBaseService.searchUser(userInfoBase);
    }

    @PostMapping("/user/add.do")
    public ResultVo login(@RequestBody UserInfoBase userInfoBase){

        return userInfoBaseService.saveUser(userInfoBase);
    }



}
