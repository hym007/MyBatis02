package com.hym.mapper;

public interface Mapper {
    int findIdCardById(int idc);
    //一对一的嵌套查询
    int findPersonById(int idp);
    //一对一的嵌套结果
    int findPersonById2(int idp2);
    //一对多的嵌套结果
    int findUserById(int idu);
    //一对多的嵌套查询
    int findUserById2(int idu2);
    int findOrdersById(int ido);
}
