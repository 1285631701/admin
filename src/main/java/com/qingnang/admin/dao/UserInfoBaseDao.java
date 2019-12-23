package com.qingnang.admin.dao;

import com.qingnang.admin.entity.User;
import com.qingnang.admin.entity.UserInfoBase;
import com.qingnang.admin.utils.UserInfoBaseSqlProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoBaseDao {

    @Select("SELECT userid,username,name,homepage,kind, department,email,phone,regip,`level` from live_userinfo_base where flag =1 ")
    User findAll();
    //条件查询
    @SelectProvider(type= UserInfoBaseSqlProvider.class,method="selectUser")
    UserInfoBase selectUser(UserInfoBase user);
    //动态修改
    @UpdateProvider(type= UserInfoBaseSqlProvider.class, method="updateUser")
    int updateUser(UserInfoBase user);
    //动态添加
    @InsertProvider(type= UserInfoBaseSqlProvider.class, method="saveUser")
    int saveUser(UserInfoBase user);
}
