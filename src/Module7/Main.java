package Module7;
import java.util.*;
import java.util.stream.Collectors;

import Module4.First.Currency;

/**
 * Created by Vladymyr on 19.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Vova", "Diak", "Kiev", 2000);
        User user2 = new User(2, "Igor", "Diak", "London", 122000);
        User user3 = new User(3, "Bruce", "Wayne", "New York", 10000000);
        User user4 = new User(4, "Osvald", "Moon", "New York", 500000);
        User user5 = new User(5, "Jack", "Wilshere", "London", 14000000);
        User user6 = new User(6, "Olivier", "Sanchez", "Paris", 1232000);
        User user7 = new User(7, "Igor", "Meld", "Madrid", 52000);
        User user8 = new User(8, "Vova", "Diak", "Lviv", 32000);
        User user9 = new User(9, "Vova", "Gad", "Odesa", 12000);
        User user10 = new User(10, "Vanja", "Zhmot", "Kiev", 22000);

        List<Order> list = new ArrayList<>();
        list.add(new Order(1, 1300, Currency.USD, "item1", "shop1", user1));
        list.add(new Order(2, 1400, Currency.UAH, "item2", "shop2", user2));
        list.add(new Order(3, 2200, Currency.USD, "item2", "shop2", user3));
        list.add(new Order(4, 3200, Currency.UAH, "item4", "shop4", user4));
        list.add(new Order(5, 4200, Currency.USD, "item6", "shop6", user5));
        list.add(new Order(6, 5200, Currency.USD, "item6", "shop6", user6));
        list.add(new Order(7, 5200, Currency.USD, "item7", "shop7", user7));
        list.add(new Order(8, 6200, Currency.UAH, "item8", "shop8", user8));
        list.add(new Order(9, 2200, Currency.USD, "item10", "shop10", user9));
        list.add(new Order(10, 1200, Currency.USD, "item10", "shop10", user10));

        //list.sort(new PriceComparator());
        //list.sort(new CityAndPriceComparator());
        //list.sort(new ItemShopCityComparator());
        //deleteDoubles(list);
       // deleteLessPrice(list);
        uniqueCities(list);
        System.out.print(list);
    }

    private static void sortByCurrency(List<Order> list) {
        List<Order> uahList = new ArrayList<>();
        List<Order> usdList = new ArrayList<>();
        for (Order order : list) {
            if (order.getCurrency() == Currency.USD) usdList.add(order);
            if (order.getCurrency() == Currency.UAH) uahList.add(order);
        }
    }

    private static void deleteDoubles(List<Order> list) {
        Set<Order> hs = new HashSet<>();
        hs.addAll(list);
        list.clear();
        list.addAll(hs);
    }

    private static ArrayList<Order> deleteLessPrice(List<Order> list) {
        ArrayList<Order> q1 = new ArrayList<>();
        Iterator<Order> iterator = list.iterator();

        while (iterator.hasNext()){
            Order mp = iterator.next();

            if (mp.getPrice()<1500){
                iterator.remove();
            }
        }
        return q1;
    }
     private static void uniqueCities(List<Order> list){
          Map<String,List<Order>> sortCities = list.stream().collect(Collectors.groupingBy((order)-> order.getUser().getCity()));
     }
 }





