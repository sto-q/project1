package com.lq.service.impl;

import com.lq.dao.StudentDao;
import com.lq.dao.impl.StudentDaoImpl;
import com.lq.pojo.student;
import com.lq.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDao studentDao=new StudentDaoImpl();
    @Override
    public List<student> findAllStudent() {
        try {
            return studentDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("查询所有学生失败", e);
        }
    }

    @Override
    public student findStudentById(int id) {
        try {
            return studentDao.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("根据ID查询学生失败", e);
        }
    }

    @Override
    public boolean addStudent(student stu) {
        try {
            return studentDao.add(stu)>0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("添加学生失败", e);
        }
    }

    @Override
    public boolean deleteStudent(int id) {
        try {
            return studentDao.delete(id)>0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除学生失败", e);
        }
    }

    @Override
    public boolean updateStudent(student stu) {
        try {
            return studentDao.update(stu)>0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("修改学生失败", e);
        }
    }
}
