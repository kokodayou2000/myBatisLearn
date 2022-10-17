package org.example.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Customer;
import org.example.entity.Goods;
import org.example.repository.CustomerRepository;
import org.example.repository.GoodsRepository;

import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

//        CustomerRepository mapper = session.getMapper(CustomerRepository.class);
//        Long cId = Long.parseLong("1");
//        Customer byId = mapper.findById(cId);
//        System.out.println(byId);

        GoodsRepository mapper = session.getMapper(GoodsRepository.class);
        long gid = Long.parseLong("1");
        Goods byId = mapper.findById(gid);
        System.out.println(byId);
        session.close();
    }
}
