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
            <c:if test="${loggedIn!='true' || loggedIn== null}"><h1>Non sei loggato</h1></c:if>
            <c:if test="${loggedIn=='true'}">
            <jsp:include page="sidebar.jsp"/>

            <div id="bacheca"> 
      
                <c:if test="${nuovopost!='conferma'}">
                <div id="NewPost" class="post">
                    <img src="${CurrentUser.urlFoto}">
                    <div id="FormPost">
                    <div class="formDati">
                        <form action="bacheca.html?<c:if test="${utente!=null}">utente=${utente}</c:if><c:if test="${gruppo!=null}">gruppo=${gruppo}</c:if>" method="post">
                        <div>
                        <label class="firstlabel" for="testo">Testo</label>
                        <input type="text" name="testo" id="testo">       
                    </div>
                    <div>
                        <label for="allegato">Allegato</label>
                        <input type="url" name="allegato" id="allegato">
                    </div>
                    <div id="scelte">
                        <label for="sceltavuota">Testo</label>
                        <input type="radio" name="scelta" id="sceltavuota" value="solotesto">
                        <label for="sceltalink">Link</label>
                        <input type="radio" name="scelta" id="sceltalink" value="LINK">
                        <label for="sceltaimg">Immagine</label>
                        <input type="radio" name="scelta" id="sceltaimg" value="IMG">
                        <c:if test="${nuovopost=='confermato' && gruppo!=null}">
                            <p>Hai scritto nella bacheca di ${nomegruppo}</p>
                        </c:if>
                        <c:if test="${nuovopost=='confermato' && gruppo==null}">
                            <p>Hai scritto nella bacheca di ${nome} ${cognome}</p>
                        </c:if>
                    </div>
                       <div>
                        <button type="submit" name="nuovopost" value="ottieniconferma">Conferma</button>
                      </div>
                      </form>
                     </div>
                    </div>
                </div>  
               </c:if>
                    <c:if test="${nuovopost=='conferma'}">
                          <div class="post">
                        <img src="${CurrentUser.urlFoto}" alt="Foto Profilo di ${CurrentUser.nome} ${CurrentUser.cognome}" title="${post.autore.nome} ${post.autore.cognome}"/>
                        <div class="postUser">
                        <p>${CurrentUser.nome}${CurrentUser.cognome}</p>
                        </div>
                        <div class="postDescr">
                            <p>${testo}</p>
                            <c:if test="${scelta == 'IMAGE'}">
                                <div class="postDescrImg">    
                                    <img alt="Foto descrizione" src="${allegato}">
                                </div>
                            </c:if>
                            <c:if test="${post.postType == 'LINK'}">
                                <a href="${post.allegato}" target="_blank">${allegato}</a>
                            </c:if>
                         <form action="bacheca.html?<c:if test="${utente!=null}">utente=${utente}</c:if><c:if test="${gruppo!=null}">gruppo=${gruppo}</c:if>" method="post">
                            <button type="submit" name="nuovopost" value="confermato">Conferma</button>
                         </form>
                            
                        </div>
                    </div>
                    </c:if>
               
                
                <c:forEach var="post" items="${posts}">

                    <div class="post">
                        <img src="${post.autore.urlFoto}" alt="Foto Profilo di ${post.autore.nome} ${post.autore.cognome}" title="${post.autore.nome} ${post.autore.cognome}"/>
                        <div class="postUser">
                        <p>${post.autore.nome}${post.autore.cognome}</p>
                        </div>
                        <div class="postDescr">
                            <p>${post.content}</p>
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
            </c:if>
        </div>

    </body>
</html>
