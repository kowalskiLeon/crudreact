/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configs;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Pessoa
 *
 * @author guilherme.moura
 * @param <T>
 */
@NoRepositoryBean
@Transactional
public interface BaseRepository<T extends PojoBase> extends JpaRepository<T, Long> {

    @Modifying
    @Query("UPDATE #{#entityName} obj set obj.id = :valor  where obj.id =:id ")
    public void atualizarCampoId(@Param("valor") Long valor, @Param("id") Long id);
    
}
