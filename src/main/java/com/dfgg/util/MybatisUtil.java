package com.dfgg.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author dfggking@hotmail.com
 * @version 1.0
 * @date 2018/4/18
 */
public class MybatisUtil {
    
    private static SqlSessionFactory sqlSessionFactory = null;
    
    public static SqlSessionFactory getSqlSessionFactory(){
        InputStream inputStream = null;
        if (sqlSessionFactory == null) {
            try {
                String resource = "mybatis-config.xml";
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }
}
