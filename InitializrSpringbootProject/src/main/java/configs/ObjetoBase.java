/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configs;

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
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author guilherme.moura
 */
@MappedSuperclass
//@EntityListeners(LogEvents.class)
//@IdClass(ObjetoBaseId.class)
public abstract class ObjetoBase implements PojoBase {

    protected static final long serialVersionUID = 1L;

    @Type(type = "pg-uuid")
    @Generated(GenerationTime.INSERT)
    @Column(name = "uuid", columnDefinition = "UUID unique default uuid_generate_v4()", unique = true, insertable = false, nullable = true)
    protected UUID uuid;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    protected Long id;
    @Column(name = "ativo", columnDefinition = "boolean DEFAULT true")
    protected Boolean ativo;

    @Generated(GenerationTime.INSERT)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "inclusao", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Date inclusao;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modificacao", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    protected Date modificacao;

    @Column(name = "exclusao_logica", columnDefinition = "boolean DEFAULT false")
    protected Boolean exclusaoLogica;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "exclusao")
    protected Date exclusao;

    @Column(name = "versao")
    protected Integer versao;

    @Column(name = "id_sync")
    protected Long idSync;

    public ObjetoBase(UUID uuid, Long id, Boolean ativo, Date inclusao, Date modificacao, Boolean exclusaoLogica, Date exclusao, Integer versao, Long idSync) {
        this.uuid = uuid;
        this.id = id;
        this.ativo = ativo;
        this.inclusao = inclusao;
        this.modificacao = modificacao;
        this.exclusaoLogica = exclusaoLogica;
        this.exclusao = exclusao;
        this.versao = versao;
        this.idSync = idSync;
    }

    public ObjetoBase() {
    }

    public ObjetoBase(UUID uuid) {
        this.uuid = uuid;
    }

    public ObjetoBase(Long id) {
        this.id = id;
    }

    @Override
    public Date getInclusao() {
        return inclusao;
    }

    @Override
    public void setInclusao(Date inclusao) {
        this.inclusao = inclusao;
    }

    @Override
    public Date getModificacao() {
        return modificacao;
    }

    public void setModificacao(Date modificacao) {
        this.modificacao = modificacao;
    }

    @Override
    public Boolean getExclusaoLogica() {
        return exclusaoLogica;
    }

    @Override
    public void setExclusaoLogica(Boolean exclusaoLogica) {
        this.exclusaoLogica = exclusaoLogica;
    }

    public Date getExclusao() {
        return exclusao;
    }

    public void setExclusao(Date exclusao) {
        this.exclusao = exclusao;
    }

    public Boolean isValid() {
        return true;
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 17 * hash + Objects.hashCode(this.id);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final ObjetoBase other = (ObjetoBase) obj;
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        return true;
//    };
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Object getClone() {
        try {
            return (super.clone());
        } catch (CloneNotSupportedException e) {
            return (null);
        }
    }

    public Long getIdSync() {
        return idSync;
    }

    public void setIdSync(Long idSync) {
        this.idSync = idSync;
    }

    @Override
    public String toString() {
        return "ObjetoBase{" + "uuid=" + uuid + ", id=" + id + '}';
    }

    protected String toString(String className, String otherAttrs) {
        return className + "{" + "uuid=" + uuid + ", id=" + id + (otherAttrs != null ? ", " + otherAttrs : "") + '}';
    }
}
