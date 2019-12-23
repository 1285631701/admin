package com.qingnang.admin.controller;

import com.qingnang.admin.entity.User;
import com.qingnang.admin.service.AdminActionService;
import com.qingnang.admin.service.ArticleService;
import com.qingnang.admin.service.UserService;
import com.qingnang.admin.vo.ResultVo;
import org.mockito.internal.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController//等于 @Controller + @ResponseBody
@CrossOrigin//跨域
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    AdminActionService adminActionService;

    @Autowired
    ArticleService articleService;
    //登录
    @PostMapping("/login.do")
    public ResultVo login(String name, String passWord, HttpServletRequest request){
        ResultVo ro = userService.login(name,passWord);
        User user = (User) ro.getData();
        request.getSession().setAttribute("user", user);
        return ro;
    }

    //一级导航栏
    @PostMapping("/daohang.do")
    public ResultVo daohang(){
        ResultVo ro = adminActionService.selectDaoHang();

        return ro;
    }

    //二级导航栏
    @PostMapping("/secondDaoHang.do")
    public ResultVo secondDaoHang(int parentId){
        ResultVo ro = adminActionService.selectDaoHangByParentId(parentId);

        return ro;
    }
    //文章分页展示 根据flag值来判断是否审核
    @PostMapping("/article/list.do")
    public ResultVo selectPage(Integer page,Integer pageSize,Integer flag) {
        if (flag==null){
            flag =0;
        }
        ResultVo vo = articleService.findAll(page, pageSize,flag);
        return vo;
    }

    //文章删除
    @PostMapping("/article/delete.do")
    public ResultVo delete(int articleId) {
        ResultVo vo = articleService.delete(articleId);
        return vo;
    }

    //文章审核
    @PostMapping("/article/check.do")
    public ResultVo check(int articleId, int flag) {
        ResultVo vo = articleService.check(articleId,flag);
        return vo;
    }
    //根据用户名查找文章
    @PostMapping("/article/search.do")
    public ResultVo findByAuthor(String author) {
        ResultVo vo = articleService.findByAuthor(author);
        return vo;
    }
    //根据id查找文章
    @PostMapping("/article/findById.do")
    public ResultVo selectPage(int articleId) {
        ResultVo vo = articleService.findById(articleId);
        return vo;
    }

}
