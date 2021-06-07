package configs;

import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseService<T> {

    Iterable<T> listAllObjetos();

    Page findAll(T objeto, Pageable pageable);

    Page findAllWithoutRestriction(T objeto, Pageable pageable);

    Page findAll(T objeto);

    T getObjetoById(Long id);

    T getObjetoByUUID(UUID id);

    void updateUUID(T objeto);

    T saveObjeto(T obj);

    T saveObject(T obj, boolean updateVersion);

    T deleteObjeto(Long id);
}
