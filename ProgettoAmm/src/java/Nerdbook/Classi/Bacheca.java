/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nerdbook.Classi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author moku
 */
@WebServlet(name = "Bacheca", urlPatterns = {"/bacheca.html"})
public class Bacheca extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session=request.getSession();
        
        //se l'utente non è loggato
          if (session.getAttribute("loggedIn") == null) {
            session.invalidate();
            request.getRequestDispatcher("profilo.jsp").forward(request, response);
            return;
        }
          
          //se l'utente è loggato
          if (session.getAttribute("loggedIn") != null){
             
            if(request.getParameter("gruppo")!=null){ 
             int id=Integer.parseInt(request.getParameter("gruppo"));
             ArrayList<Post> listaPost=PostFactory.getInstance().getPostList(GruppiFactory.getInstance().getGruppiById(id));
             Gruppi gruppo=GruppiFactory.getInstance().getGruppiById(Integer.parseInt(request.getParameter("gruppo")));
             request.setAttribute("posts",listaPost);
             request.setAttribute("gruppo", id);
             request.setAttribute("nomegruppo",gruppo.getNome());
            }
            else{
             if(request.getParameter("utente")==null||(request.getParameter("utente")!=null&&request.getParameter("utente").equals(""))){
              ArrayList<Post> listaPost= PostFactory.getInstance().getPostList((Utente)session.getAttribute("CurrentUser"));
              request.setAttribute("utente", ((Utente)session.getAttribute("CurrentUser")).getId());
              request.setAttribute("posts",listaPost);
             }
             else{
             int id=Integer.parseInt(request.getParameter("utente"));
             ArrayList<Post> listaPost=PostFactory.getInstance().getPostList(UtenteFactory.getInstance().getUtenteById(id));
             request.setAttribute("posts",listaPost);
             request.setAttribute("utente", id);            
             }
            } 
             String nuovopost=request.getParameter("nuovopost");
             
           if (nuovopost!=null && nuovopost.equals("ottieniconferma")){
              String testo=request.getParameter("testo");
              String allegato=request.getParameter("allegato");
              String scelta=request.getParameter("scelta");
              request.setAttribute("scelta", scelta);
              
              if(scelta!=null && scelta.equals("solotesto")){
                 request.setAttribute("testo",testo);
                 request.setAttribute("nuovopost","conferma");
              }
              if(scelta!=null && scelta.equals("LINK")){
                request.setAttribute("testo",testo);
                request.setAttribute("allegato",allegato);
                request.setAttribute("nuovopost","conferma");
              }
              if(scelta!=null && scelta.equals("IMG")){
                request.setAttribute("testo",testo);
                request.setAttribute("allegato",allegato);
                request.setAttribute("nuovopost","conferma");
              }
           }
           if (nuovopost!=null && nuovopost.equals("confermato")){
               Utente utente=null;
             
                     
             if(request.getParameter("utente")==null){
                utente=(Utente)session.getAttribute("CurrentUser");                    
                }
             if(request.getParameter("utente")!=null){
                utente=UtenteFactory.getInstance().getUtenteById(Integer.parseInt(request.getParameter("utente")));
               }
              request.setAttribute("nome", utente.getNome());
              request.setAttribute("cognome", utente.getCognome());
              request.setAttribute("nuovopost","confermato");
           }
          }
         
          request.getRequestDispatcher("bacheca.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
