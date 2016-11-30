package Module5;

import java.util.Date;

/**
 * Created by Vladymyr on 28.11.2016.
 */
public class GoogleAPI extends AbsAPI {

    Room[] bookingRooms;

    public GoogleAPI()
    {
        bookingRooms = new Room[4];
        bookingRooms[0]=new Room(10,5000,4,new Date(),"Lama","Chernivtsi");
        bookingRooms[1]=new Room(22,4000,3,new Date(),"Garem","Istanbul");
        bookingRooms[2]=new Room(23,3000,2,new Date(),"Molly","Chicago");
        bookingRooms[3]=new Room(24,2000,1,new Date(),"Joker","Las Vegas");
        bookingRooms[4]=new Room(25,1000,5,new Date(),"Emirates","London");

    }

    @Override
    public Room[] getRooms() {
        return bookingRooms;
    }
}
