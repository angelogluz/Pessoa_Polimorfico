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
public class Endereco implements Serializable {

    private String rua;
    private String bairro;
    private String cep;

    public Endereco() {
        rua = "";
        bairro = "";
        cep = "";
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
}
