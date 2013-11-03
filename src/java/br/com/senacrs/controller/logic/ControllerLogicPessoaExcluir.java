/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.controller.logic;

import br.com.senacrs.model.dao.JDBCPessoaDAO;
import br.com.senacrs.model.dao.PessoaDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angelo
 */
public class ControllerLogicPessoaExcluir implements ControllerLogic{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        PessoaDAO pd = new JDBCPessoaDAO();
        pd.excluir(id);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
    
}
