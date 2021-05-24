/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author guilherme.moura
 */

@Entity
public class BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    
    public Date inclusao;
    
    public Date remocao;
    
    public Date modificacao;
    
    public boolean exclusao_logica;

    public BaseEntity() {
    }

    public BaseEntity(Long id, Date inclusao, Date remocao, Date modificacao, boolean exclusao_logica) {
        this.id = id;
        this.inclusao = inclusao;
        this.remocao = remocao;
        this.modificacao = modificacao;
        this.exclusao_logica = exclusao_logica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInclusao() {
        return inclusao;
    }

    public void setInclusao(Date inclusao) {
        this.inclusao = inclusao;
    }

    public Date getRemocao() {
        return remocao;
    }

    public void setRemocao(Date remocao) {
        this.remocao = remocao;
    }

    public Date getModificacao() {
        return modificacao;
    }

    public void setModificacao(Date modificacao) {
        this.modificacao = modificacao;
    }

    public boolean isExclusao_logica() {
        return exclusao_logica;
    }

    public void setExclusao_logica(boolean exclusao_logica) {
        this.exclusao_logica = exclusao_logica;
    }
    
    
    
    
}
