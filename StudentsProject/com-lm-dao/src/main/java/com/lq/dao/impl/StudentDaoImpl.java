package com.lq.dao.impl;

import com.lq.dao.StudentDao;
import com.lq.pojo.student;
import com.lq.util.DataSourceConfig;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

//实现studentDao接口
public class StudentDaoImpl implements StudentDao {
    //构建QueryRunner核心对象，这个对象作用就是进行数据库的crud操作
    QueryRunner runner = new QueryRunner(DataSourceConfig.getDataSource());

    @Override
    public List<student> findAll() {
        String sql = "SELECT * FROM student";
        try {
            List<student> studentList = runner.query(sql, new BeanListHandler<student>(student.class));
            return studentList;
        } catch (SQLException e) {
            e.printStackTrace();
            throw  new RuntimeException(e);
        }
    }

    @Override
    public student findById(int id) {
        String sql = "SELECT * FROM student WHERE id=?";
        try {
            return runner.query(sql,new BeanHandler<student>(student.class),id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int add(student stu) {
        String sql = "INSERT INTO student(student_no,name,gender,age, class_name,major) VALUES(?,?,?,?,?,?)";
        try {
            return runner.update(sql,stu.getStudent_no(),stu.getName(),stu.getGender(),stu.getAge(),stu.getClass_name(),stu.getMajor());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM student WHERE id = ?";
        try {
            return runner.update(sql,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int update(student stu) {
        String sql = "UPDATE student SET student_no=?,name=?,gender=?,age=?,class_name=?,major=? WHERE id=?";
        try {
            return runner.update(sql,stu.getStudent_no(),stu.getName(),stu.getGender(),stu.getAge(),stu.getClass_name(),stu.getMajor(),stu.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
