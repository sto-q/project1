package com.lq.web;

import com.lq.service.StudentService;
import com.lq.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteStudent")
public class deleteService extends HttpServlet {
    private StudentService service=new StudentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");//设置编码
        int id=Integer.parseInt(request.getParameter("id"));
        boolean success= service.deleteStudent(id);
        if(success){
            response.sendRedirect("show");
        }else {
            // 删除失败，回到添加页面并提示
            request.setAttribute("errorMsg", "删除失败");
            request.getRequestDispatcher("deleteStudent.jsp").forward(request, response);
        }
    }
}
