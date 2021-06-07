/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import configs.PojoBase;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author guilherme.moura
 */

@MappedSuperclass
public abstract class BaseEntity implements PojoBase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    
    @Generated(GenerationTime.INSERT)
    @Temporal(TemporalType.TIMESTAMP)
    public Date inclusao;
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date remocao;
    
    @UpdateTimestamp
    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    public Date modificacao;
    
    @Column(name = "exclusao_logica", columnDefinition = "boolean DEFAULT false" , nullable = true)
    public boolean exclusao_logica;
    
    @Column(name = "ativo", columnDefinition = "boolean DEFAULT true", nullable = true)
    public boolean ativo;
    
    @Column(nullable = true)
    public UUID uuid;
    
    @Column(nullable = true)
    public int versao;

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

    @Override
    public UUID getUuid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUuid(UUID uuid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean getAtivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAtivo(Boolean ativo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean getExclusaoLogica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setExclusaoLogica(Boolean ativo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getExclusao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setExclusao(Date exclusao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getVersao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setVersao(Integer versao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
