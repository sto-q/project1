package com.lq.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 封装操作数据的工具类
 */
public class DataSourceConfig {
    //resources中必须要有文件c3p-config.xml，在初始化ComboPooledDataSource对象是会自动寻找
    //ComboPooledDataSource会自动加载c3p-config.xml文件
    static ComboPooledDataSource dataSource=new ComboPooledDataSource();//初始化
    //获取数据源的方法
    public  static ComboPooledDataSource getDataSource(){return dataSource;};

    //获取数据库连接对象
    public static Connection getConnection()throws SQLException {
        return dataSource.getConnection();//返回一个数据库连接
    }
}
