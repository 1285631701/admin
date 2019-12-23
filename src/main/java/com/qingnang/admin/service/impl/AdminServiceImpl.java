package com.qingnang.admin.service.impl;

import com.qingnang.admin.dao.AdminActionDao;
import com.qingnang.admin.entity.AdminAction;
import com.qingnang.admin.service.AdminActionService;
import com.qingnang.admin.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminActionService {

    @Autowired
    private AdminActionDao adminActionDao;

    @Override
    public ResultVo selectDaoHang() {
        List<AdminAction> list = adminActionDao.SelectByLevel(1);

        return ResultVo.setOK(list);
    }

     @Override
    public ResultVo selectDaoHangByParentId(int parent) {
        List<AdminAction> list = adminActionDao.SelectByParentId(parent);

        List<Map> mapList = new ArrayList<>();
         for (AdminAction admin:list) {
             Map<String,Object> map = new HashMap<>();
             List<AdminAction> clist = adminActionDao.SelectByParentId(admin.getActionId());
             map.put("title",admin.getActionName());
             map.put("clist",clist);
             mapList.add(map);
         }

        return ResultVo.setOK(mapList);
    }
}
