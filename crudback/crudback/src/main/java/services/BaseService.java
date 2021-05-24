/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.BaseEntity;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import repository.BaseRepository;

/**
 *
 * @author guilherme.moura
 */

@Service
public class BaseService<T extends BaseEntity>{
    
    protected BaseRepository crudRepository;
    
    public BaseService(BaseRepository<T> crudRepository) {
        this.crudRepository = crudRepository;
    }

    public Iterable<T> listAllObjetos() {
        return crudRepository.findAll();
    }

    public Page findAll(T objeto, Pageable pageable) {
        objeto.setExclusao_logica(false);
        ExampleMatcher matcher = ExampleMatcher.matchingAll()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreNullValues().withIgnoreCase();

        Example<T> example = Example.of(objeto, matcher);

        return crudRepository.findAll(example, pageable);
    }
    
    public Page findAllWithoutRestriction(T objeto, Pageable pageable) {
        ExampleMatcher matcher = ExampleMatcher.matchingAll()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreNullValues().withIgnoreCase();

        Example<T> example = Example.of(objeto, matcher);

        return crudRepository.findAll(example, pageable);
    }

    
    public Page findAll(T objeto) {
        return this.findAll(objeto, PageRequest.of(0, 1000, Sort.by(Sort.Direction.ASC, "id")));
    }

    
    public T getObjetoById(Long id) {
        return (T) crudRepository.findById(id).orElse(null);
    }

    
    public T getObjetoByUUID(UUID id) {
        return (T) crudRepository.findByUuid(id).orElse(null);
    }

    
    public void updateUUID(T objeto) {
        crudRepository.atualizarCampoUuid(objeto.getUuid(), objeto.getId());
    }

    
    public T saveObject(T obj, boolean updateVersion) {
        if (obj.getExclusaoLogica() == null) {
            obj.setExclusaoLogica(false);
        }
        if (obj.getInclusao() == null) {
            obj.setInclusao(new Date());
        }
        obj.setModificacao(new Date());
        
        return (T) crudRepository.save(obj);
    }

    public T saveObjeto(T obj) {
        return saveObject(obj, true);
    }

    public T deleteObjeto(Long id) {
        PojoBase pojo = (PojoBase) crudRepository.findById(id).orElse(null);
        pojo.setExclusaoLogica(true);
        pojo.setModificacao(new Date());
        pojo.setExclusao(new Date());
        pojo.setAtivo(false);
        return (T) crudRepository.save(pojo);
    }

    public JpaRepository getRepository() {
        return this.crudRepository;
    }

    public <U extends ObjetoBase> U simplificarObjeto(U obj) {
        if (obj != null) {
            try {
                U aux = (U) obj.getClass().newInstance();
                aux.setId(obj.getId());
                aux.setUuid(obj.getUuid());
                return aux;
            } catch (Exception ex) {
                Logger.getLogger(BaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return obj;
    }
}
