package ru.elina;

import javax.servlet.http.HttpServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.PrintWriter;

public class PrintProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<String> product = new ArrayList <String>();
//        ArrayList<Product> productList = new ArrayList <Product>();
//        Product pr1 =  new Product("Table", 1000);
//        productList.add(pr1);
        product.add("Table");
        product.add("Sofa");
        product.add("Chair");
        product.add("TV");
        product.add("Door");
        product.add("Lamp");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("<h1>Our products</h1>");
        for (int i = 0; i < product.size()-1; i++)
            printWriter.write("<table><tr><td><th>" + product.get(i) + "</th></td></tr></table>");


    }
}