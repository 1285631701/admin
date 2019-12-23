package com.qingnang.admin.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qingnang.admin.dao.ArticleDao;
import com.qingnang.admin.entity.Article;
import com.qingnang.admin.service.ArticleService;
import com.qingnang.admin.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public ResultVo findAll(Integer page, Integer size,int flag) {
        Map<String, Object> map = new HashMap<>();
        Page<Object> pageInfo = PageHelper.startPage(page, size);

        List<Article> list = articleDao.findAll(flag);

        map.put("total", pageInfo.getTotal());
        map.put("rows", list);

        return ResultVo.setOK(map);
    }

    @Override
    public ResultVo delete(int articleid) {
        articleDao.delete(articleid);
        return ResultVo.setOK(null);
    }

    @Override
    public ResultVo check(int articleid, int flag) {
        articleDao.check(articleid,flag);
        return ResultVo.setOK(null);
    }

    @Override
    public ResultVo findByAuthor(String author) {
        //author = "%"+author +"%";
        return ResultVo.setOK( articleDao.findByAuthor(author));
    }

    @Override
    public ResultVo findById(int articleid) {
        return ResultVo.setOK(articleDao.findById(articleid));
    }

}
