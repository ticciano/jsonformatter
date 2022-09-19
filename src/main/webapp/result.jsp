<%-- 
    Document   : result
    Created on : Sep 19, 2022, 8:27:37 AM
    Author     : ticiano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String json = (String) request.getAttribute("result");
        %>
        
        <h2>Resultado</h2>
        <div> <%= json %> </div>
        <a href="/jsonformatter/index.html">inicio</a>
    </body>
</html>
