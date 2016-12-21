package Module7;

import Module4.First.Currency;
import java.util.Iterator;

import java.util.*;

/**
 * Created by Vladymyr on 19.12.2016.
 */
public class TreeMain {
    public static void main(String[] args) {

        User user1 = new User(1, "Vova", "Diak", "Kiev", 2000);
        User user2 = new User(2, "Igor", "Dam", "London", 122000);
        User user3 = new User(3, "Bruce", "Wayne", "New York", 10000000);
        User user4 = new User(4, "Osvald", "Petrov", "New Yor", 500000);
        User user5 = new User(5, "Jack", "Wilshere", "London", 14000000);
        User user6 = new User(6, "Olivier", "Petrov", "Paris", 1232000);
        User user7 = new User(7, "Ivan", "Meld", "Madrid", 52000);
        User user8 = new User(1, "Vova", "Diak", "Kiev", 2000);
        User user9 = new User(9, "Vlad", "Gad", "Odesa", 12000);
        User user10 = new User(10, "Vanja", "Zhmot", "Barca", 22000);

        TreeSet<Order> list = new TreeSet<>();
        list.add(new Order(1, 1300, Currency.USD, "item1", "shop1", user1));
        list.add(new Order(2, 1400, Currency.UAH, "item2", "shop2", user2));
        list.add(new Order(3, 2200, Currency.USD, "item2", "shop2", user3));
        list.add(new Order(4, 3200, Currency.UAH, "item4", "shop4", user4));
        list.add(new Order(5, 4200, Currency.USD, "item6", "shop6", user5));
        list.add(new Order(6, 1200, Currency.USD, "item6", "shop6", user6));
        list.add(new Order(7, 5200, Currency.USD, "item7", "shop7", user7));
        list.add(new Order(8, 6200, Currency.UAH, "item8", "shop8", user8));
        list.add(new Order(10, 2200, Currency.USD, "item10", "shop10", user10));
        list.add(new Order(10, 2200, Currency.USD, "item10", "shop10", user10));

        //checkLastName(list,"Petrov");

        //deleteUsd(list);
        maxPrice(list);
    }
        public static void deleteUsd(TreeSet <Order> list){
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            Order elem = (Order) iter.next();
            if (elem.getCurrency() == Currency.USD) {
                iter.remove();
            }
        }
        System.out.println(list);
        }




    public static boolean checkLastName(Set<Order> list, String lastName) {
        boolean a = false;
        for (Order order : list) {
            if (order.getUser().getLastName().equals(lastName)) {
                a = true;
            }
        }
        return a;
    }

    public static void maxPrice(Set <Order> list) {
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            Order elem = (Order) iter.next();
            if (elem.getPrice() < 5500) {
                iter.remove();
            }
        }
        System.out.println(list);
    }

}









