package Module8;

import java.util.List;

/**
 * Created by Vladymyr on 03.01.2017.
 */
public class AbstractDAOIMPL <T> implements AbstractDAO <T> {
    @Override
    public void save(T t) {
        getList().add(t);
    }

    @Override
    public void delete(T t) {
        getList().remove(t);

    }

    @Override
    public void deleteAll(List T) {
        getList().removeAll(T);
    }

    @Override
    public void saveAll(List T) {
        getList().addAll(T);
    }

    @Override
    public List<T> getList() {
        return getList();
    }

    @Override
    public void deleteById(long id) {
        getList().remove(id);

    }

    @Override
    public T get(long id) {
       return  getList().get((int)(id));
    }
}
