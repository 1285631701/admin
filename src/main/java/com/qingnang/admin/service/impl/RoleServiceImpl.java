package com.qingnang.admin.service.impl;

import com.qingnang.admin.dao.RoleDao;
import com.qingnang.admin.entity.Role;
import com.qingnang.admin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public Role selectByRoleId(int roleId) {
        return roleDao.selectByRoleId(roleId);
    }
}
