package com.qingnang.admin.dao;

import com.qingnang.admin.entity.Role;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao {

    @Select("SELECT role_name as roleName,action_list as actionList,role_describe as roleDescribe from live_role WHERE role_id = #{roleId}")
    Role selectByRoleId(int roleId);
}
