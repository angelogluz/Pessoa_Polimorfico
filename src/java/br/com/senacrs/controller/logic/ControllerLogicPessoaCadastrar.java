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
 * @author Angelo
 */
public class ControllerLogicPessoaCadastrar implements ControllerLogic {

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome(request.getParameter("nome"));
        pessoa.setSobrenome(request.getParameter("sobrenome"));

        pessoa.getEndereco().setBairro(request.getParameter("bairro"));
        pessoa.getEndereco().setCep(request.getParameter("cep"));
        pessoa.getEndereco().setRua(request.getParameter("rua"));

        //request.getSession().setAttribute("pessoa", pessoa);
        
        PessoaDAO p = new JDBCPessoaDAO();
        p.salvar(pessoa);


        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
