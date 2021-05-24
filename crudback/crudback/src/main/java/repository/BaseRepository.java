/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entidades.BaseEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author guilherme.moura
 */
@Repository
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, Long> {
    @Modifying
    @Query("UPDATE #{#entityName} obj set obj.id = :valor  where obj.id =:id ")
    public void atualizarCampoId(@Param("valor") Long valor, @Param("id") Long id);
    @Modifying
    @Query("UPDATE #{#entityName} obj set obj.uuid = :valor  where obj.id =:id ")
    public void atualizarCampoUuid(@Param("valor") UUID valor, @Param("id") Long id);
    @Modifying
    @Query("UPDATE #{#entityName} obj set obj.ativo = :valor  where obj.id =:id ")
    public void atualizarCampoAtivo(@Param("valor") Boolean valor, @Param("id") Long id);
    
    public Optional<T> findByUuid(UUID uuid);
}
