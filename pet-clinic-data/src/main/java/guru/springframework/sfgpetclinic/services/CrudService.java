package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by kabdi on 30/11/18.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
