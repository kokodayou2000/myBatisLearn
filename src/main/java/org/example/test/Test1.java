package org.example.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Account;
import org.example.repository.AccountRepository;

import java.io.InputStream;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //读取config
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession session = sessionFactory.openSession();

        AccountRepository mapper = session.getMapper(AccountRepository.class);
//        List<Account> accountList = mapper.findAll();
//        for (Account account : accountList) {
//            System.out.println(account);
//        }
//        Account account = new Account(3L, "王五", "123", 10);
//        int save = mapper.save(account);
//        session.commit();

//        Account account = new Account(3L, "王五", "123", 20);
//        mapper.update(account);
//        session.commit();
//        Long id = Long.parseLong("1");
//        mapper.deleteById(id);
//        session.commit();

//        Account mapperById = mapper.findById(2L);
//        System.out.println(mapperById);

//        List<Account> byName = mapper.findByName("张三");
//        System.out.println(byName);
//        List<Account> byNameAndAge = mapper.findByNameAndAge("张三", 19);
//        System.out.println(byNameAndAge);

//        int count = mapper.count();
//        System.out.println(count);

//        Integer count2 = mapper.count2();
//        System.out.println(count2);

//        String nameById = mapper.findNameById(1L);
//        System.out.println(nameById);

        session.close();
    }
}
