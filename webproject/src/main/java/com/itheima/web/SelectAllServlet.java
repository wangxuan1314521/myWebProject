package com.itheima.web;

import com.itheima.pojo.Brand;
import com.itheima.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author shkstart
 * @create 2023-02-18 15:42
 */
@WebServlet(name = "selectAllServlet")
public class SelectAllServlet extends HttpServlet {
    //1.调用BrandService来查询
    private BrandService brandService = new BrandService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Brand> brands = brandService.selectAll();
        //2.将brand存入request域
        request.setAttribute("brands", brands);
        //3.转发到brand.jsp
        request.getRequestDispatcher("/brand.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);

    }


}
