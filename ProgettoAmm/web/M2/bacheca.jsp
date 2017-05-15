<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bacheca</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Marco Romoli">
        <meta name="keywords" content="bacheca nerdbook">
        <link href="https://fonts.googleapis.com/css?family=Comfortaa" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">

    </head>
    <body>

        <c:set var="pagina" value="bacheca" scope="request"/>
        <jsp:include page="header.jsp"/>

        <div id="divBody">
            <jsp:include page="sidebar.jsp"/>

            <div id="bacheca"> 

                <c:forEach var="post" items="${posts}">

                    <div class="post">
                        <img src="${post.user.urlFoto}" alt="Foto Profilo di ${post.user.nome} ${post.user.cognome}" title="${post.user.nome} ${post.user.cognome}"/>
                        <div class="postUser">
                            <p>${post.user.nome}${post.user.cognome}</p>
                        </div>
                        <div class="postDescr">
                            <p>${post.user.content}</p>
                            <c:if test="${post.postType == 'IMAGE'}">
                                <div class="postDescrImg">    
                                    <img alt="Foto descrizione" src="${post.allegato}">
                                </div>
                            </c:if>
                            <c:if test="${post.postType == 'LINK'}">
                                <a href="${post.allegato}" target="_blank">${post.allegato}</a>
                            </c:if>  
                        </div>

                    </div>
                </c:forEach>
            </div>
        </div>

    </body>
</html>
