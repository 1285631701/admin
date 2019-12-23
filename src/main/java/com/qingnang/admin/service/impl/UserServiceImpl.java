package com.qingnang.admin.service.impl;

import com.qingnang.admin.dao.RoleDao;
import com.qingnang.admin.dao.UserDao;
import com.qingnang.admin.entity.Role;
import com.qingnang.admin.entity.User;
import com.qingnang.admin.service.UserService;
import com.qingnang.admin.utils.EncryptUtil;
import com.qingnang.admin.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Override
    public ResultVo login(String name, String password) {
        User user=userDao.selectByName(name);
        if(user!=null) {
            if(Objects.equals(user.getPassword(), EncryptUtil.md5Enc(password))) {

                Role role =roleDao.selectByRoleId(user.getRoleId());
                user.setLoginUrl(role.getActionList());
                user.setRoleName(role.getRoleName());
                //登录成功
                return ResultVo.setOK(user);
            }
        }
        return ResultVo.setERROR();
    }
}
