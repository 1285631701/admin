package com.qingnang.admin.dao;

import com.qingnang.admin.entity.AdminAction;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminActionDao {

    @Select("SELECT action_id as actionId,parent_id as parentId,action_code as actionCode, action_name as actionName,action_link as actionLink,`level`  from live_admin_action WHERE `level`=#{level} and `level` > 0")
    List<AdminAction> SelectByLevel(int level);

    @Select("SELECT action_id as actionId,parent_id as parentId,action_code as actionCode, action_name as actionName,action_link as actionLink,`level`  from live_admin_action WHERE parent_id=#{parentId} and `level` > 0")
    List<AdminAction> SelectByParentId(int parentId);
}
