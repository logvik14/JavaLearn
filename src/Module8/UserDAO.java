package Module8;

import java.util.List;

/**
 * Created by Vladymyr on 03.01.2017.
 */
public class UserDAO extends AbstractDAOIMPL {

    private long id;
    private String name;

    public UserDAO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save(Object o) {
        super.save(o);
    }

    @Override
    public void delete(Object o) {
        super.delete(o);
    }

    @Override
    public void deleteAll(List T) {
        super.deleteAll(T);
    }

    @Override
    public void saveAll(List T) {
        super.saveAll(T);
    }

    @Override
    public void deleteById(long id) {
        super.deleteById(id);
    }

    @Override
    public Object get(long id) {
        return super.get(id);
    }
}
