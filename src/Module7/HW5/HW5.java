package Module7.HW5;

import Module5.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Created by Vladymyr on 19.12.2016.
 */
public class HW5 {
    public static void main(String[] args) {


        List<Room> booking = new ArrayList<>();
        List<Room> google = new ArrayList<>();
        List<Room> tripAdvisor = new ArrayList<>();

        booking.add(new Room(20,2000,3,new Date(),"Bukovyna","Chernivtsi"));
        booking.add(new Room(11, 300, 3, new Date(), "Marcus Marriott", "New York"));
        booking.add(new Room(12, 500, 2, new Date(), "Caesars Palace", "LasVegas"));
        booking.add(new Room(18,250,3,new Date(),"Kotl","NY"));
        booking.add(new Room(19,1000,3,new Date(),"Palaca","Milan"));

        google.add(new Room(10,5000,4,new Date(),"Lama","Chernivtsi"));
        google.add(new Room(22,4000,3,new Date(),"Garem","Istanbul"));
        google.add(new Room(23,3000,2,new Date(),"Molly","Chicago"));
        google.add(new Room(24,2000,1,new Date(),"Joker","Las Vegas"));
        google.add(new Room(25,1000,5,new Date(),"Emirates","London"));

        tripAdvisor.add(new Room(30,100,3,new Date(),"Emery","Ibiza"));
        tripAdvisor.add(new Room(10,200,2,new Date(),"Misha","Donetsk"));
        tripAdvisor.add(new Room(40,300,3,new Date(),"Naughty","Hamburg"));
        tripAdvisor.add(new Room(50,400,1,new Date(),"Arsch","Berlin"));
        tripAdvisor.add(new Room(60,400,3,new Date(),"Arsenal","London"));
    }
}

