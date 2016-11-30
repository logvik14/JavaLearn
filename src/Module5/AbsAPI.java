package Module5;

/**
 * Created by Vladymyr on 30.11.2016.
 */
public class AbsAPI implements API {

    @Override
        public Room[] findRooms(int price, int persons, String city, String hotel) {

            int num = 0;

            for (Room room : getRooms()) {
                if (room.getPrice() == price && room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel) {
                    num++;
                }
            }

            Room[] res = new Room[num];

            int index = 0;
            for (Room room : getRooms()) {
                if (room.getPrice() == price && room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel) {
                    res[index] = room;
                }
            }
            return res;

        }


    @Override
    public Room[] getRooms() {
        return new Room[0];
    }
}
