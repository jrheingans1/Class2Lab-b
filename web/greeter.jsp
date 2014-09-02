<%-- 
    Document   : greeter
    Created on : Sep 1, 2014, 11:32:11 PM
    Author     : James
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Greeting Message</h1>
        <%
            Object obj = request.getAttribute("name");
            if (obj == null) {
                out.println("Sorry something went wrong");
            } else {
                out.println(obj.toString());
            }
        %>
    </body>
</html>
