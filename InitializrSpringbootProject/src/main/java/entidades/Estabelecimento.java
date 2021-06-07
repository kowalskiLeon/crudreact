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
@Table(name = "estabelecimento", schema = PojoBase.DB)
public class Estabelecimento extends BaseEntity {
    
    public String nome;
    public Endereco endereco;
    public Pessoa dono;
    public TipoEstabelecimento tipoEstabelecimento;
    public String descricao;

    public Estabelecimento() {
    }
    

    public Estabelecimento(String nome, Endereco endereco, Pessoa dono, TipoEstabelecimento tipoEstabelecimento, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.dono = dono;
        this.tipoEstabelecimento = tipoEstabelecimento;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public TipoEstabelecimento getTipoEstabelecimento() {
        return tipoEstabelecimento;
    }

    public void setTipoEstabelecimento(TipoEstabelecimento tipoEstabelecimento) {
        this.tipoEstabelecimento = tipoEstabelecimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
}
