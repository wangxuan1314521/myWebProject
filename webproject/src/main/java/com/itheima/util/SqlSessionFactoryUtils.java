package com.itheima.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author shkstart
 * @create 2023-02-18 15:16
 */



public class SqlSessionFactoryUtils {
    private static SqlSessionFactory sqlSessionFactory;
//静态代码块会随着类的执行而执行，且只执行一次
    static {

        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;


    }

}
