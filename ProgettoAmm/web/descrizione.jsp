<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Descrizione</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Marco Romoli">
        <meta name="keywords" content="nerdbook info informazioni guida domande">
        <link href="https://fonts.googleapis.com/css?family=Comfortaa" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>

        <c:set var="pagina" value="descrizione" scope="request"/>
        <jsp:include page="header.jsp"/>
        
        <div id="divBody">
            <div id="sommario">
                <div class="post">
                      <h2>Sommario</h2>
                   <ol>
                    <li> <a href="#iscrizione">Iscrizione</a>
                       <ol>
                         <li class="sottoli">
                           <a href="#guidaiscrizione">Guida iscrizione</a>
                         </li>
                       </ol>
                    </li>
                    <li><a href="#infocosti">Infocosti</a>
                        <ol>
                            <li class="sottoli">
                                <a href="#quantocosta">Quanto costa?</a>
                            </li>
                        </ol>
                    </li>
                    <li><a href="#infogen">Perchè usare Nerdbook</a></li>
                </ol>
                </div>
            </div>
            <div id="description">
                <h1>Guida a Nerdbook</h1>
            <div id="guidaiscrizione" class="post">
                <h2>Come iscriversi?</h2>
                <h3>Guida iscrizione</h3>
                <p>Vai alla sezione dedicata al Login, dovrai compilare un semplice form che ti permetterè  di entrare a far parte di Nerdbook</p>
            </div>
            <div id="infocosti" class="post">
                <h2>Quanto costa?</h2>
                <h3>Nerdbook è un servizio gratuito!</h3>
                <p>Nerdbook è completamente gratuitio.Ma se vuoi darci soldi a noi sta bene.</p>
            </div>        
            <div id="infogen" class="post">
                <h2>Perchè iscriversi?</h2>
                <p>Sei nerd, quindi non hai amici. Con Nerdbook potrai conoscerli, semplice.</p>
            </div> 
           </div>
        </div>
    </body>
</html>
