
package com.emergentes.controlador;

import com.emergentes.ConexionesDB;
import emergentes.modelo.Libro;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op;
        op =(request.getParameter("op") ==null)? request.getParameter("op"):"List";
        ArrayList<Libro> lista = new ArrayList<Libro>();
        
        ConexionesDB canal = null;
        try {
            canal = new ConexionesDB();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn =canal.conectar();
        
        if (op.equals("List")){
            
            
        }if (op.equals("nuevo")){
            
        }
        if (op.equals("eliminar")){
            
        }
        
        }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        }
    
    }

    

