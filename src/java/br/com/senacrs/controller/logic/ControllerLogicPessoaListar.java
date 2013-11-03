/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.controller.logic;

import br.com.senacrs.model.dao.JDBCPessoaDAO;
import br.com.senacrs.model.dao.PessoaDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angelo
 */
public class ControllerLogicPessoaListar implements ControllerLogic{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PessoaDAO p = new JDBCPessoaDAO();            
            request.setAttribute("pessoas", p.listar());            
            request.getRequestDispatcher("listaPessoa").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ControllerLogicPessoaListar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
