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
import java.util.List;
@WebServlet("/show")
public class ShowService extends HttpServlet {
    private StudentService service=new StudentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");//设置编码
        List<student> studentList=service.findAllStudent();
        request.setAttribute("show",studentList);
        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}
