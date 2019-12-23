package com.qingnang.admin.utils;

import com.qingnang.admin.entity.UserInfoBase;
import org.apache.ibatis.jdbc.SQL;

public class UserInfoBaseSqlProvider {

    /**
     * 动态查询语句
     * @param user
     * @return
     */
    public String selectUser(UserInfoBase user){

        return new SQL(){{
            SELECT("userid,username,name,homepage,kind, department,email,phone,regip,`level` ");
            FROM("live_userinfo_base");
            if(user.getUsername() != null){
                WHERE("username=#{username}");
            }
            if(user.getRegtime() != null){
                WHERE("regtime=#{regtime}");
            }
        }}.toString();

    }

    public  String saveUser(UserInfoBase user){
        return new SQL(){{
            INSERT_INTO("live_userinfo_base");

            if(user.getUsername() != null){
                VALUES("username","#{username}");
            }
            if(user.getHomepage() != null){
                VALUES("homepage","#{name}");
            }
            if(user.getKind() != null){
                VALUES("kind","#{kind}");
            }
            if(user.getDepartment() != null){
                VALUES("department","#{department}");
            }
            if(user.getImgthumb() != null){
                VALUES("imgthumb","#{imgthumb}");
            }
            if(user.getName() != null){
                VALUES("name","#{name}");
            }
            if(user.getPasswd() != null){
                VALUES("passwd","#{passwd}");
            }
            if(user.getPhone() != null){
                VALUES("phone","#{phone}");
            }
            if(user.getEmail() != null){
                VALUES("email","#{email}");
            }
            if(user.getQq() != null){
                VALUES("qq","#{qq}");
            }
            if(user.getRegtime() != null){
                VALUES("regtime","#{regtime}");
            }
            if(user.getRegip() != null){
                VALUES("regip","#{regip}");
            }
            if(user.getGender() != null){
                VALUES("gender","#{gender}");
            }
            if(user.getBirthday() != null){
                VALUES("birthday","#{birthday}");
            }
            if(String.valueOf(user.getUsertype()) != null){
                VALUES("usertype","#{usertype}");
            }
            if(user.getUserinfo() != null){
                VALUES("userinfo","#{userinfo}");
            }
            if(String.valueOf(user.getLevel()) != null){
                VALUES("level","#{level}");
            }
            if(String.valueOf(user.getRecomm_sort()) != null){
                VALUES("recomm_sort","#{recomm_sort}");
            }
            if(user.getAppstatus() != null){
                VALUES("appstatus","#{appstatus}");
            }
            if(String.valueOf(user.getApproomvip()) != null){
                VALUES("approomvip","#{approomvip}");
            }
            if(user.getMtime() != null){
                VALUES("mtime","#{mtime}");
            }
            if(String.valueOf(user.getIsmaster()) != null){
                VALUES("ismaster","#{ismaster}");
            }
            if(String.valueOf(user.getStatus()) != null){
                VALUES("status","#{status}");
            }

        }}.toString();
    }

    /**
     * @param user
     * @return
     */
    public String updateUser(UserInfoBase user){
        return new SQL(){{
            UPDATE("live_userinfo_base");

            //条件写法.
            if(user.getUsername() != null){
                SET("username","#{username}");
            }
            if(user.getHomepage() != null){
                SET("homepage","#{name}");
            }
            if(user.getKind() != null){
                SET("kind","#{kind}");
            }
            if(user.getDepartment() != null){
                SET("department","#{department}");
            }
            if(user.getImgthumb() != null){
                SET("imgthumb","#{imgthumb}");
            }
            if(user.getName() != null){
                SET("name","#{name}");
            }
            if(user.getPasswd() != null){
                SET("passwd","#{passwd}");
            }
            if(user.getPhone() != null){
                SET("phone","#{phone}");
            }
            if(user.getEmail() != null){
                SET("email","#{email}");
            }
            if(user.getQq() != null){
                SET("qq","#{qq}");
            }
            if(user.getRegtime() != null){
                SET("regtime","#{regtime}");
            }
            if(user.getRegip() != null){
                SET("regip","#{regip}");
            }
            if(user.getGender() != null){
                SET("gender","#{gender}");
            }
            if(user.getBirthday() != null){
                SET("birthday","#{birthday}");
            }
            if(String.valueOf(user.getUsertype()) != null){
                SET("usertype","#{usertype}");
            }
            if(user.getUserinfo() != null){
                SET("userinfo","#{userinfo}");
            }
            if(String.valueOf(user.getLevel()) != null){
                SET("level","#{level}");
            }
            if(String.valueOf(user.getRecomm_sort()) != null){
                SET("recomm_sort","#{recomm_sort}");
            }
            if(user.getAppstatus() != null){
                SET("appstatus","#{appstatus}");
            }
            if(String.valueOf(user.getApproomvip()) != null){
                SET("approomvip","#{approomvip}");
            }
            if(user.getMtime() != null){
                SET("mtime","#{mtime}");
            }
            if(String.valueOf(user.getIsmaster()) != null){
                SET("ismaster","#{ismaster}");
            }
            if(String.valueOf(user.getStatus()) != null){
                SET("status","#{status}");
            }
            if(String.valueOf(user.getFlag()) != null){
                SET("flag","#{flag}");
            }
            WHERE("userid=#{userid}");
        }}.toString();
    }

}
