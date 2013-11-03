/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.model.dao;

import br.com.senacrs.bean.Pessoa;
import br.com.senacrs.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class JDBCPessoaDAO implements PessoaDAO {

    Connection connection;

    public JDBCPessoaDAO() {
        connection = ConnectionFactory.getConnection();
    }

    @Override
    public void salvar(Pessoa pessoa) {

        String sql = "INSERT INTO pessoa "
                + "(nome, sobrenome, rua, bairro, cep) VALUES"
                + "(?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getSobrenome());
            ps.setString(3, pessoa.getEndereco().getRua());
            ps.setString(4, pessoa.getEndereco().getBairro());
            ps.setString(5, pessoa.getEndereco().getCep());

            ps.executeUpdate();

            ps.close();


        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao salvar o bean", ex);
        }


    }

    @Override
    public void excluir(int id) {
        try {
            String sql = "DELETE FROM pessoa WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Problema ao Excluir.", ex);
        }


    }

    @Override
    public List listar() {
        PreparedStatement ps;
        ResultSet rs;
        List<Pessoa> pessoas = new ArrayList();
        try {

            String sql = "SELECT * FROM pessoa";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setSobrenome(rs.getString("sobrenome"));
                p.getEndereco().setBairro(rs.getString("bairro"));
                p.getEndereco().setCep(rs.getString("cep"));
                p.getEndereco().setRua(rs.getString("rua"));
                pessoas.add(p);
            }

            ps.close();
            rs.close();
            return pessoas;
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao listar Pessoas", ex);
        }



    }

    @Override
    public void atualizar(Pessoa pessoa) {
        String sql = "UPDATE pessoa SET nome=?, sobrenome=?, rua=?,"
                + "bairro=?,cep=? WHERE id=?";
        try {

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getSobrenome());
            ps.setString(3, pessoa.getEndereco().getRua());
            ps.setString(4, pessoa.getEndereco().getBairro());
            ps.setString(5, pessoa.getEndereco().getCep());
            ps.setInt(6, pessoa.getId());

            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha ao atualizar registro de Pessoa", ex);
        }


    }

    @Override
    public Pessoa buscar(int id) {
        String sql = "SELECT * FROM pessoa WHERE id=?";
        Pessoa p = new Pessoa();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setSobrenome(rs.getString("sobrenome"));
            p.getEndereco().setRua(rs.getString("rua"));
            p.getEndereco().setBairro(rs.getString("bairro"));
            p.getEndereco().setCep(rs.getString("cep"));


        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Uma falha ocorreu ao buscar a Pessoa", ex);
        }
        return p;
    }
}
