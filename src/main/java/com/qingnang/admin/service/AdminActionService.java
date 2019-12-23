package com.qingnang.admin.service;

import com.qingnang.admin.entity.AdminAction;
import com.qingnang.admin.entity.Role;
import com.qingnang.admin.vo.ResultVo;

import java.util.List;


public interface AdminActionService {
    //一级导航
    ResultVo selectDaoHang();
    //根据parentId查找子导航栏
    ResultVo selectDaoHangByParentId(int parent);
}
