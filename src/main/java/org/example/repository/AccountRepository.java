package org.example.repository;

import org.example.entity.Account;

import java.util.List;

public interface AccountRepository {

    int save(Account account);

    int update(Account account);

    //使用包装类更好一点，如果输入的值是null，基本数据类型就直接抛异常，如果用包装类，能进行一些 null值判断
    int deleteById(Long id);

    List<Account> findAll();

    Account findById(Long id);

    List<Account> findByName(String name);

    List<Account> findByNameAndAge(String username,int age);

//    int count();

    Integer count2();
    String findNameById(Long id);

}
