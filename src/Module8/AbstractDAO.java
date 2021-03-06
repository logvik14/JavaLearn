package Module8;

import java.util.List;

/**
 * Created by Vladymyr on 03.01.2017.
 */
public interface AbstractDAO <T> {
    void save (T t);
    void delete(T t);
    void deleteAll(List T);
    void saveAll(List T);
    List<T> getList();
    void deleteById(long id);
    T get(long id);
}
