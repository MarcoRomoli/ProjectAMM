<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Profilo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Marco Romoli">
        <meta name="keywords" content="nerdbook profilo dati inserimento">
        <link href="https://fonts.googleapis.com/css?family=Comfortaa" rel="stylesheet">

        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    
    <body>
        <c:set var="pagina" value="profilo" scope="request"/>
        <jsp:include page="header.jsp"/>
            
        
       
            <div id="divBody">  
          <c:if test="${loggedIn!='true' || loggedIn== null}"><h1>Non sei loggato</h1></c:if>
          <c:if test="${loggedIn=='true'}">
            <jsp:include page="sidebar.jsp"/>
              <div id="content">
                <div class="formDati">
                <div id="imgprofilo">
                <img alt="avatar" src="Assets/profilopic.jpg">
                </div>
                <form action="profilo.html" method="post">
                    <div>
                        <label class="firstlabel" for="nomeutente">Nome</label>
                        <input type="text" name="nome" id="name" <c:if test="${validazione =='1'}"> value="${nome}"</c:if>/>
                        
                    </div>
                    <div>
                        <label for="cognomeutente">Cognome</label>
                        <input type="text" name="cognome" id="cognome" <c:if test="${validazione =='1'}"> value="${cognome}"</c:if>/>
                    </div>
                    <div>
                        <label for="img">URL immagine profilo</label>
                        <input type="url" name="img" id="img" <c:if test="${validazione =='1'}"> value="${img}"</c:if>/>
                    </div>
                    <div>
                        <label for="presentazione">Frase Di Presentazione</label>
                        <textarea name="presentazione" id="presentazione" <c:if test="${validazione =='1'}"> value="${frasepresntazione}"</c:if>></textarea>
                    </div>
                    <div>
                        <label for="datanascita">Data di Nascita</label>
                        <input type="date" name="datanascita" id="datanascita" <c:if test="${validazione =='1'}"> value="${datanascita}"</c:if>/>
                    </div>
                    <div>
                        <label for="pswd">Password</label>
                        <input type="password" name="psw" id="psw" <c:if test="${validazione =='1'}"> value="${psw}"</c:if>/>
                    </div> 
                    <div>
                        <label for="confermapsw"> Conferma Password</label>
                        <input type="password" name="confermapsw" id="confermapsw" <c:if test="${validazione =='1'}"> value="${confermapsw}"</c:if>/>
                    </div>
                    
                    <c:if test="${validazione !=null}">
                        <p>I dati sono stati inseriti correttamente</p>
                    </c:if>
                    <c:if test="${errore== true}">
                        <p>Le password non coincidono</p>
                    </c:if>
                    <button type="submit" name="conferma" value="true">Conferma</button>
                </form>
            </div>
              </div>
          </div>
        </c:if>
    </body>
</html>
