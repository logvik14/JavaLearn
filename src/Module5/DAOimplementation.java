package Module5;

import java.util.Date;

/**
 * Created by Vladymyr on 01.12.2016.
 */
public class DAOimplementation implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("room " + room.getId() + "is saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("room " + room.getId() + "deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("room " + room.getId() + "updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(1, 200, 4,new Date(),"Momo", "London");
        System.out.println("Searching room with this " + id);
        return room;
    }
}
