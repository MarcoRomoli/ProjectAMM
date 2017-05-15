<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Marco Romoli">
        <meta name="keywords" content="login nerdbook iscrizione iscriviti">
        <link href="https://fonts.googleapis.com/css?family=Comfortaa" rel="stylesheet">

        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        
        <c:set var="pagina" value="login" scope="request"/>
        <jsp:include page="header.jsp"/>
        
             <div id="logBody">
                <h1>Nerbook: Login</h1>  
                 <div id="login">
                        <form action="login.html" method="post">
                                <label class="firstlabel" for="username">Username</label>
                                <input type="text" name="username" id="username"/>
                                <label for="password">Password</label>
                                <input type="password" name="password" id="password"/>
                                <c:if test="${invalidData==true}">
                                    <p>Hai inserito dei dati non validi,riprova.</p>
                                </c:if>
                                <button type="submit">Conferma</button>
                        </form>
                    </div>  
               </div>
    </body>
</html>
