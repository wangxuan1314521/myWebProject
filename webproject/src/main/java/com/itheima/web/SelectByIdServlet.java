package com.itheima.web;

import com.itheima.pojo.Brand;
import com.itheima.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2023-02-18 19:20
 */
@WebServlet(name = "selectByIdServlet")
public class SelectByIdServlet extends HttpServlet {
    //1.调用BrandService来查询
    private BrandService brandService = new BrandService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收id
        String id = request.getParameter("id");
        //调用service查询
        Brand brand = brandService.selectById(Integer.parseInt(id));//将字符串转为Integer
        //存储带request域中
        request.setAttribute("brand",brand);
//转发到update.jsp
        request.getRequestDispatcher("update.jsp").forward(request,response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }


}
