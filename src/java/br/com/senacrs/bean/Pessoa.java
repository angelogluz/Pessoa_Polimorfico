/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.bean;

import java.io.Serializable;

/**
 *
 * @author Angelo
 */
public class Pessoa implements Serializable {
    private int id;
    private String nome;
    private String sobrenome;
    private Endereco endereco;

    public Pessoa() {
        nome = "";
        sobrenome = "";
        endereco = new Endereco();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
