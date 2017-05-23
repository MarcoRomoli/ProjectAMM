<%-- 
    Document   : sidebar
    Created on : 8-mag-2017, 11.48.33
    Author     : moku
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div id="sidebar">
      
                <h2>Persone</h2>
                    <ol class="sottsidebar">
                        <c:forEach var="utente" items="${utenti}">
                            <li><a href="bacheca.html?utente=${utente.id}"><img src="${utente.urlFoto}"> ${utente.nome} ${utente.cognome}</a></li>
                        </c:forEach>
                    </ol>
                
                <h2>Gruppi</h2>
                    <ol class="sottsidebar">
                        <c:forEach var="gruppo" items="${gruppi}">
                            <li><a href="bacheca.html?gruppo=${gruppo.id}"><img src="${gruppo.imgGruppo}">${gruppo.nome}</a></li>
                        </c:forEach>
                    </ol>
</div>