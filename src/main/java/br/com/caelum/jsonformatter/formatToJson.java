/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.caelum.jsonformatter;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author ticiano
 */
public class formatToJson extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
       ObjectMapper mapper = new ObjectMapper();
       List <String> strings = new ArrayList < > ();
       
       strings.add(request.getParameter("string1"));
       strings.add(request.getParameter("string2"));
       
       String json = mapper.writeValueAsString(strings);
       System.out.println(json);
       
       RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
       request.setAttribute("result", json);
       rd.forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
