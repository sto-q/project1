package com.lq.dao;

import com.lq.pojo.student;

import java.util.List;
//
public interface StudentDao {
     List<student> findAll();//查询所以学生
     student findById(int id);//通过ID查单个学生
     int add(student stu);//添加学生
     int delete(int id);//通过ID删除学生
     int update(student stu);//修改学生信息
}
