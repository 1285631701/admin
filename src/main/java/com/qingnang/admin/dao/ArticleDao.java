package com.qingnang.admin.dao;

import com.qingnang.admin.entity.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleDao {

    @Select(" SELECT articleid,title,keywords,`desc`,content,author,source,imgthumb,time,flag from live_article where flag=#{flag} and flag>=0")
    List<Article> findAll(int flag);
    //删除文章（假删除）
    @Update("UPDATE live_article set flag=-1 where articleid = #{articleid}")
    void delete(int articleid);

    //审核文章
    @Update("UPDATE live_article set flag=#{flag} where articleid = #{articleid}")
    void check(int articleid,int flag);

    //通过姓名查找文章
    @Select(" SELECT articleid,title,keywords,`desc`,content,author,source,imgthumb,time,flag from live_article where author LIKE CONCAT('%',#{author},'%') and flag>=0")
    List<Article> findByAuthor(String author);
    //通过id查询
    @Select(" SELECT articleid,title,keywords,`desc`,content,author,source,imgthumb,time,flag from live_article where articleid=#{articleid}")
    Article findById(int articleid);


}
