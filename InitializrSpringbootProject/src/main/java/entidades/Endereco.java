/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import configs.PojoBase;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author guilherme.moura
 */
@Entity
@Table(name = "endereco", schema = PojoBase.DB)
public class Endereco extends BaseEntity{
    
    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String referencia;

    public Endereco() {
    }

    public Endereco(String endereco, String numero, String complemento, String bairro, String referencia) {
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.referencia = referencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
    
    
    
    
}
