package com.qingnang.admin.service;

import com.qingnang.admin.vo.ResultVo;


public interface UserService {

    ResultVo login(String name, String password);

}
