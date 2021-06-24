package configs;

import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseServiceImpl<T extends PojoBase> implements BaseService<T> {

    protected BaseRepository crudRepository;

    public BaseServiceImpl(BaseRepository<T> crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public Iterable<T> listAllObjetos() {
        return crudRepository.findAll();
    }

    @Override
    public Page findAll(T objeto, Pageable pageable) {
        objeto.setExclusaoLogica(false);
        ExampleMatcher matcher = ExampleMatcher.matchingAll()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreNullValues().withIgnoreCase();

        Example<T> example = Example.of(objeto, matcher);

        return crudRepository.findAll(example, pageable);
    }
    @Override
    public Page findAllWithoutRestriction(T objeto, Pageable pageable) {
        ExampleMatcher matcher = ExampleMatcher.matchingAll()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreNullValues().withIgnoreCase();

        Example<T> example = Example.of(objeto, matcher);

        return crudRepository.findAll(example, pageable);
    }

    @Override
    public Page findAll(T objeto) {
        return this.findAll(objeto, PageRequest.of(0, 1000, Sort.by(Sort.Direction.ASC, "id")));
    }

    @Override
    public T getObjetoById(Long id) {
        return (T) crudRepository.findById(id).orElse(null);
    }


    

    @Override
    public T saveObject(T obj, boolean updateVersion) {
        if (obj.getExclusaoLogica() == null) {
            obj.setExclusaoLogica(false);
        }
        obj.setModificacao(new Date());
        return (T) crudRepository.save(obj);
    }

    @Override
    public T saveObjeto(T obj) {
        return saveObject(obj, true);
    }

    @Override
    public T deleteObjeto(Long id) {
        PojoBase pojo = (PojoBase) crudRepository.findById(id).orElse(null);
        pojo.setExclusaoLogica(true);
        pojo.setModificacao(new Date());
        pojo.setExclusao(new Date());
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
                return aux;
            } catch (Exception ex) {
                Logger.getLogger(BaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return obj;
    }
}
