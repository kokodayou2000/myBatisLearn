package org.example.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Classes;
import org.example.entity.Student;
import org.example.repository.ClassesRepository;
import org.example.repository.StudentRepository;

import java.io.InputStream;

public class Test2 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession session = build.openSession();

//        StudentRepository mapper = session.getMapper(StudentRepository.class);

//        Long id = Long.parseLong("1");
//
//        Student byId = mapper.findById(id);
//
//        System.out.println(byId);

        ClassesRepository mapper = session.getMapper(ClassesRepository.class);

        Long cid = Long.parseLong("1");
        Classes byId = mapper.findById(cid);
        System.out.println(byId);

        session.close();

    }
}
