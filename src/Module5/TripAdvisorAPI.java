package Module5;

import java.util.Date;

/**
 * Created by Vladymyr on 28.11.2016.
 */
public class TripAdvisorAPI extends AbsAPI {

    Room[] bookingRooms;

    @Override
    public Room[] getRooms() {
        return bookingRooms;
    }

    public TripAdvisorAPI() {

        bookingRooms = new Room[4];
        bookingRooms[0]=new Room(30,100,3,new Date(),"Emery","Ibiza");
        bookingRooms[1]=new Room(10,200,2,new Date(),"Misha","Donetsk");
        bookingRooms[2]=new Room(40,300,3,new Date(),"Naughty","Hamburg");
        bookingRooms[3]=new Room(50,400,1,new Date(),"Arsch","Berlin");
        bookingRooms[4]=new Room(60,400,3,new Date(),"Arsenal","London");


    }

}
