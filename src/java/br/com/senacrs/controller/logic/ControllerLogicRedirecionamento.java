/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.controller.logic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angelo
 */
public class ControllerLogicRedirecionamento implements ControllerLogic{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = request.getParameter("page");
        
        
        //response.sendRedirect(page);
        request.getRequestDispatcher(page).forward(request, response);
        
    }
    
}
