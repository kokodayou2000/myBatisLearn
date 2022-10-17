package org.example.repository;

import org.example.entity.Classes;
import org.example.entity.Student;

import java.util.List;

public interface ClassesRepository {

    /**
     * 通过id得到班级对象
     * @param id
     * @return
     */
    Classes findById(Long id);

}
