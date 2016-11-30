package Module5;

import java.util.Date;

/**
 * Created by Vladymyr on 01.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.requestRooms(200,2,"Chernivtsi","Lil");
        controller.requestRooms(300,1,"NY","Palace");
        for(Room room : controller.requestRooms(200,2,"Kiev","Hilton")){
            System.out.println(room.getId());
        }

        API api1 = new BookingComAPI();
        API api2 = new GoogleAPI();
        controller.check(api1,api2);

        Room r1 = new Room(1, 222, 2, new Date(), "hotel", "city");
        DAO dao = new DAOimplementation();
        dao.save(r1);
        dao.delete(r1);
    }
}
