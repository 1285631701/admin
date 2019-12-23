package com.qingnang.admin.service;

import com.qingnang.admin.vo.ResultVo;

public interface ArticleService {

    //分页查询
    ResultVo findAll(Integer page, Integer size,int flag);
    //删除
    ResultVo delete(int articleid);
    //审核文章
    ResultVo check(int articleid,int flag);
    //通过姓名查找文章
    ResultVo findByAuthor(String author);
    //通过id查询
    ResultVo findById(int articleid);

}
