package com.inks.hb.authInfo.dao;

import com.inks.hb.authInfo.pojo.AuthInfo;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AuthInfoDao {

    /**
     * 插入一条数据到权限表中
     *
     * @param authInfo 完整的authInfo对象
     * @throws SQLException 数据库
     */
    void insertAuthInfo(AuthInfo authInfo) throws SQLException;

    /**
     * 查询AuthInfo表的长度
     *
     * @return 权限表长度
     * @throws SQLException 数据库
     */
    int queryAuthInfoNum() throws SQLException;

    /**
     * 分页查询权限表中数据
     *
     * @param start 开始位置, 第一个数据的起始坐标为0.
     *
     *  ____________________________________________________
     *  _                                                  _
     *  _   注意：为了方便计算，传入的start在实际使用时已经减一     _
     *  _   也就是数字1代表第一个数据。                         _
     *  ____________________________________________________
     *
     * @param length 返回多少数据
     * @return 所有的权限表字段
     * @throws SQLException 数据库
     */
    ArrayList<AuthInfo> query(int start,int length) throws SQLException;
}
