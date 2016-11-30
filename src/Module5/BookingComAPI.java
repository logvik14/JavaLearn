package Module5;

import java.util.Date;

/**
 * Created by Vladymyr on 28.11.2016.
 */
public class BookingComAPI extends AbsAPI {

    Room[] bookingRooms;

    public BookingComAPI()
    {
        bookingRooms = new Room[4];
        bookingRooms[0]=new Room(20,2000,3,new Date(),"Bukovyna","Chernivtsi");
        bookingRooms[1]=new Room(23,500,3,new Date(),"Lol","Amsterdam");
        bookingRooms[2]=new Room(21,400,3,new Date(),"Indigo","Kiev");
        bookingRooms[3]=new Room(18,250,3,new Date(),"Kotl","NY");
        bookingRooms[4]=new Room(19,1000,3,new Date(),"Palaca","Milan");


    }

    @Override
    public Room[] getRooms() {
        return bookingRooms;
    }
}
