package org.example.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Account;

import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        //加载myBatis配置文件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //根据配置文件得到工厂对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //path + id
        String statement = "mapper/AccountMapper.save";
        Account account = new Account(1L,"张三","123",19);
        sqlSession.insert(statement,account);
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
