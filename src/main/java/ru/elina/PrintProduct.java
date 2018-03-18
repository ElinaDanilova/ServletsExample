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
//        ArrayList<String> product = new ArrayList <String>();


        ArrayList<Product> productList = new ArrayList <Product>();
        Product pr1 =  new Product("Table", 1000);
        productList.add(pr1);
        Product pr2 =  new Product("Sofa", 15000);
        productList.add(pr2);
        Product pr3 =  new Product("Chair", 1500);
        productList.add(pr3);
        Product pr4 =  new Product("TV", 40000);
        productList.add(pr4);

//        product.add("Table");
//        product.add("Sofa");
//        product.add("Chair");
//        product.add("TV");
//        product.add("Door");
//        product.add("Lamp");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("<h1>Our products:</h1>");
        printWriter.write("<table border bgcolor=\"#FFE4B5\" width=\"150\" height=\"50\"><tr><td align=\"center\" valign=\"middle\" width=\"75\" height=\"50\">Name</td><td align=\"center\" valign=\"middle\"  width=\"75\" height=\"50\">Price</td></tr></table>");
//        for (int i = 0; i < product.size(); i++)
//            printWriter.write("<table><tr><td><th>" + product.get(i) + "</th></td></tr></table>");
        for (int i = 0; i < productList.size(); i++)
            printWriter.write("<table border bgcolor=\"#FFF8DC\" width=\"150\" height=\"50\"><tr><td align=\"center\" valign=\"middle\" width=\"75\" height=\"50\">" + productList.get(i).name +"</td><td align=\"center\" valign=\"middle\" width=\"75\" height=\"50\">"+productList.get(i).price + "</td></tr></table>");

    }
}