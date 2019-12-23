package com.qingnang.admin.dao;

import com.qingnang.admin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Select("SELECT user_id as userId,user_name as userName,email,password,ec_salt as ecSalt,add_time as addTime,last_login as lastLogin,last_ip as lastIp,action_list as actionList,nav_list as navList,lang_type as langType,agency_id as agentId,suppliers_id as suppliersId,todolist,role_id as roleId from live_admin_user WHERE user_name=#{name}")
    User selectByName(String name);

}
