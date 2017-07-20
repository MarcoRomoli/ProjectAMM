/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/M2/profilo.html"})
public class Profilo extends HttpServlet {

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
        
       //Apertura della sessione
        HttpSession session = request.getSession();
 
        //se l'utente non è loggato
          if (session.getAttribute("loggedIn") == null) {
            session.invalidate();
            request.getRequestDispatcher("profilo.jsp").forward(request, response);
            return;
        }
    
        
         if (request.getParameter("conferma")!=null&&request.getParameter("conferma").equals("true")){
             
            String nome = request.getParameter("nome");
            String cognome = request.getParameter("cognome"); 
            String img = request.getParameter("img");
            String presentazione = request.getParameter("presentazione"); 
            String datanascita = request.getParameter("datanascita");
            String psw = request.getParameter("psw");
            String confermapsw = request.getParameter("confermapsw");
            if(!psw.equals(confermapsw) && psw!=null && confermapsw!=null){request.setAttribute("errore",true);}
            else{
                request.setAttribute("validazione","1");
                request.setAttribute("nome",nome);
                request.setAttribute("cognome",cognome);
                request.setAttribute("img",img);
                request.setAttribute("presentazione",presentazione);
                request.setAttribute("datanascita",datanascita);
                request.setAttribute("psw",psw);
                request.setAttribute("confermapsw",confermapsw);
            }      
            
         }   
         request.getRequestDispatcher("profilo.jsp").forward(request, response); 
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