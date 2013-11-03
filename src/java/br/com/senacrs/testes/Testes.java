/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.testes;

import br.com.senacrs.model.dao.JDBCPessoaDAO;
import br.com.senacrs.model.dao.PessoaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Angelo
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            PessoaDAO pd = new JDBCPessoaDAO();
            pd.listar();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"\n"+ ex.getCause());
        }
    }
}
