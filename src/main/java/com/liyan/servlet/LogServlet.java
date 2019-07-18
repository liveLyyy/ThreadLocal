package com.liyan.servlet;

import com.liyan.pojo.Log;
import com.liyan.service.Impl.LogServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insert")
public class LogServlet extends HttpServlet {
        private LogServiceImpl logService = new LogServiceImpl();
        @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("utf-8");
            Log log = new Log();
            log.setAccOut(req.getParameter("accout"));
            log.setAccIn(req.getParameter("accin"));
            log.setMoney(Double.parseDouble(req.getParameter("money")));
            int index = logService.insert(log);
            if (index > 0) {
                resp.sendRedirect("success.jsp");
            } else {
                resp.sendRedirect("error.jsp");
            }
        }
}
