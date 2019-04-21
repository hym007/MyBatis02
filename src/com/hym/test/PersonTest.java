package com.hym.test;

import com.hym.po.Person;
import com.hym.util.MybatisUtill;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class PersonTest {
    public static void main(String[] args) {

    }


    /**
     * 一对一
     * 方式一
     * 嵌套查询
     */
    @Test
    public void findPersonById(){
        SqlSession sqlSession = MybatisUtill.getSqlSession(false);

        Person person = sqlSession.selectOne("findPersonById",1);
        System.out.println(person);

        MybatisUtill.closeSqlSession(sqlSession);
    }

    /**
     * 方式二
     * 嵌套结果
     */
    @Test
    public void findPersonById2(){
        SqlSession sqlSession = MybatisUtill.getSqlSession(false);

        Person person = sqlSession.selectOne("findPersonById2",1);

        System.out.println(person);
        MybatisUtill.closeSqlSession(sqlSession);
    }
}
