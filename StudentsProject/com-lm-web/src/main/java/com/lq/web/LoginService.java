package com.lq.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginService extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int result=0;
        // 判断用户名和密码是否为空
        if (username == null || username.trim().isEmpty()) {
            result = -1;  // 账号不存在（为空也算不存在）
        } else if (password == null || password.trim().isEmpty()) {
            result = 0;   // 密码错误（为空也算错误）
        } else {
            // 模拟简单的用户验证（实际项目应该查数据库）
            if (username.equals("admin") && password.equals("123456")) {
                result = 1;  // 登录成功
            } else if (!username.equals("admin")) {
                result = -1; // 账号不存在
            } else {
                result = 0;  // 密码错误
            }
        }
        PrintWriter writer=response.getWriter();
        writer.print(result);
        writer.flush();
        writer.close();

    }
}
