package com.hym.test;

import com.hym.po.User;
import com.hym.util.MybatisUtill;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest {

    /**
     * 一对多
     * 方式一
     * 嵌套结果
     */
    @Test
    public void findUserById(){
        SqlSession sqlSession = MybatisUtill.getSqlSession(false);

        User user = sqlSession.selectOne("findUserById",1);
        System.out.println(user);

        MybatisUtill.closeSqlSession(sqlSession);
    }

    /**
     * 方式二
     * 嵌套查询
     */
    @Test
    public void findUserById2(){
        SqlSession sqlSession = MybatisUtill.getSqlSession(false);
        User user = sqlSession.selectOne("findUserById2",1);

        System.out.println(user);
        MybatisUtill.closeSqlSession(sqlSession);
    }
}
