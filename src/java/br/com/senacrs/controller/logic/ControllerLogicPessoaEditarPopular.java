/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.controller.logic;

import br.com.senacrs.bean.Pessoa;
import br.com.senacrs.model.dao.JDBCPessoaDAO;
import br.com.senacrs.model.dao.PessoaDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angelo Luz
 */
public class ControllerLogicPessoaEditarPopular implements ControllerLogic{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        PessoaDAO pd = new JDBCPessoaDAO();
        
        Pessoa p = pd.buscar(id);
        
        request.setAttribute("pessoa", p);
        request.getRequestDispatcher("editPessoa").forward(request, response);
        
    }
    
    
}
