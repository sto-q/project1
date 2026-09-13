package com.lq.web;

import com.lq.pojo.student;
import com.lq.service.StudentService;
import com.lq.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addStudent")//添加学生
public class addStudentService extends HttpServlet {
    private StudentService service=new StudentServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");//设置编码
        String student_no=request.getParameter("student_no");
        String name=request.getParameter("name");
        String gender=request.getParameter("gender");
        int age=Integer.parseInt(request.getParameter("age"));
        String class_name=request.getParameter("class_name");
        String major=request.getParameter("major");
        student stu=new student();
        stu.setStudent_no(Integer.parseInt(student_no));
        stu.setName(name);
        stu.setGender(gender);
        stu.setAge(age);
        stu.setClass_name(class_name);
        stu.setMajor(major);
        boolean success = service.addStudent(stu);
        if(success){
            response.sendRedirect("show");
        }else {
            // 添加失败，回到添加页面并提示
            request.setAttribute("errorMsg", "添加失败");
            request.getRequestDispatcher("addStudent.jsp").forward(request, response);
        }

    }

}
