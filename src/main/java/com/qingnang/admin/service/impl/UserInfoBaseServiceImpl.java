package com.qingnang.admin.service.impl;

import com.qingnang.admin.dao.UserInfoBaseDao;
import com.qingnang.admin.entity.UserInfoBase;
import com.qingnang.admin.service.UserInfoBaseService;
import com.qingnang.admin.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoBaseServiceImpl implements UserInfoBaseService {

    @Autowired
    private UserInfoBaseDao userInfoBaseDao;

    @Override
    public ResultVo saveUser(UserInfoBase userInfoBase) {
        if (userInfoBaseDao.saveUser(userInfoBase)>0){
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo searchUser(UserInfoBase userInfoBase) {
        UserInfoBase user = userInfoBaseDao.selectUser(userInfoBase);
        if (user!=null){
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateUser(UserInfoBase userInfoBase) {
        if (userInfoBaseDao.updateUser(userInfoBase)>0){
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo deleteUser(UserInfoBase userInfoBase) {
        if (userInfoBaseDao.updateUser(userInfoBase)>0){
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateLevelUser(UserInfoBase userInfoBase) {
        if (userInfoBaseDao.updateUser(userInfoBase)>0){
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }
}
