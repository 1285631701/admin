package com.qingnang.admin.service;

import com.qingnang.admin.entity.UserInfoBase;
import com.qingnang.admin.vo.ResultVo;


public interface UserInfoBaseService {
    //  添加
    ResultVo saveUser(UserInfoBase userInfoBase);

    // 搜索
    ResultVo searchUser(UserInfoBase userInfoBase);

    // 修改
    ResultVo updateUser(UserInfoBase userInfoBase);

    // 删除
    ResultVo deleteUser(UserInfoBase userInfoBase);

    // 修改会员等级
    ResultVo updateLevelUser(UserInfoBase userInfoBase);

}
