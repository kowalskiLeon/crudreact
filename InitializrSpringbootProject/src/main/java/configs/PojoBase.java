/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configs;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author breno.melo
 */
public interface PojoBase extends Serializable, Cloneable {

    public static final String DB = "testbed";

    public UUID getUuid();

    public void setUuid(UUID uuid);

    public Long getId();

    public void setId(Long id);

    public Boolean getAtivo();

    public void setAtivo(Boolean ativo);

    public Boolean getExclusaoLogica();

    public void setExclusaoLogica(Boolean ativo);

    public Date getInclusao();

    public void setInclusao(Date inclusao);

    public Date getModificacao();

    public void setModificacao(Date modificacao);

    public Date getExclusao();

    public void setExclusao(Date exclusao);

    public Integer getVersao();

    public void setVersao(Integer versao);

}
