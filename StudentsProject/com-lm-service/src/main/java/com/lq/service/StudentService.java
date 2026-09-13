package com.lq.service;

import com.lq.pojo.student;

import java.util.List;

public interface StudentService {
    List<student> findAllStudent();
    student findStudentById(int id);
    boolean addStudent(student stu);
    boolean deleteStudent(int id);
    boolean updateStudent(student stu);
}
