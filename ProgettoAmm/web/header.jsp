<%-- 
    Document   : header
    Created on : 2-mag-2017, 12.52.25
    Author     : moku
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div id="header">
            
            <div class="divTitle" id="titolo">
                Nerdbook
            </div>
            
              <div id="navbar">
                <nav>
                    <ol><c:if test="${loggedIn==true}">
                        <li <c:if test="${pagina=='bacheca'}">class="active"</c:if>> <a href="bacheca.html">Bacheca</a></li>
                        <li <c:if test="${pagina=='profilo'}">class="active"</c:if>><a href="profilo.html">Profilo</a></li>
                        </c:if>
                        <li <c:if test="${pagina=='descrizione'}">class="active"</c:if>><a href="descrizione.html">Descrizione</a></li>
                        <c:if test="${loggedIn!=true}">
                        <li <c:if test="${pagina=='login'}">class="active" </c:if>><a href="login.html">Login</a></li>          
                        </c:if>
                    </ol>
                </nav> 
               </div>
    
              <c:if test="${loggedIn==true}">
                  <div id="utenteloggato">
                  <img alt="avatar" src="${CurrentUser.urlFoto}">
                    <p>${CurrentUser.nome} ${CurrentUser.cognome}</p>
                    <p id="logout"><a href="login.html?logout=1">Logout</a></p>
                  </div>
              </c:if>
</div>