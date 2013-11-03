/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.model.dao;

import br.com.senacrs.bean.Pessoa;
import java.util.List;

/**
 *
 * @author Angelo
 */
public interface PessoaDAO {
    
    public void salvar(Pessoa pessoa);
    public void excluir(int id);
    public List listar();
    public void atualizar(Pessoa pessoa);
    public Pessoa buscar(int id);
    
    
}
