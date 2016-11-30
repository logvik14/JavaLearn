package Module5;

import java.util.Arrays;

/**
 * Created by Vladymyr on 01.12.2016.
 */
public class Controller {

    API[] apis = {new BookingComAPI(), new TripAdvisorAPI(), new GoogleAPI()};


    Room[] requestRooms(int price, int persons, String city, String hotel){
        int num = 0;
        for (API a : apis) {
            num+=a.findRooms(price,persons,city,hotel).length;
        }
        Room[] res = new Room[num];
        int i = 0;
        for (API a : apis) {
            for(Room room : a.findRooms(price,persons,city,hotel))
                res[i] = room;
            i++;
        }
        return res;
    }

    Room[] check(API api1, API api2){
        int num = 0;
        for (int i = 0; i < api1.getRooms().length ; i++) {
            for (int j = 0; j < api1.getRooms().length; j++) {
                if(api1.getRooms()[i].equals(api2.getRooms()[j])){
                    num++;
                }
            }
        }
        Room[] res = new Room[num];
        for (int i = 0; i < api1.getRooms().length; i++) {
            if (api1.getRooms()[i].equals(api2.getRooms()[i])){
                res[i] = api1.getRooms()[i];
            }
        }
        return res;
    }

}
