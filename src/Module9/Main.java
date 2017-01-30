package Module9;

import Module4.First.Currency;
import Module7.Order;
import Module7.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by Vladymyr on 30.01.2017.
 */
public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "Vova", "Petrov", "Kiev", 2000);
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


        List<Order> sortedByPrice = list
                .stream()
                .sorted(Comparator.comparing(Order::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedByPrice);

        System.out.println();

        List <Order> petrovCheck = list.stream().filter(s -> s.getUser().getLastName().equals("Petrov")).collect(Collectors.toList());
        System.out.println("Petrov is here: " + petrovCheck);

        System.out.println();

        List<Order> deleteUSD = list.stream().filter(o ->!o.getCurrency().equals(Currency.USD)).collect(Collectors.toList());
        System.out.println("Orders without USD " + deleteUSD);

        System.out.println();

        List<Order> priceBig = list.stream().filter(s ->s.getPrice() > 1500).collect(Collectors.toList());
        System.out.println("Orders with price over 1500 " + priceBig);

        System.out.println();

        List<Order> OrderUah = list.stream().filter(s ->s.getCurrency().equals(Currency.UAH)).collect(Collectors.toList());
        System.out.println(OrderUah);

        System.out.println();

        List<Order> OrderUSD = list.stream().filter(s ->s.getCurrency().equals(Currency.USD)).collect(Collectors.toList());
        System.out.println(OrderUSD);
        System.out.println();

        Map<String,List<Order>> byCities = list.stream().collect(Collectors.groupingBy(p -> p.getUser().getCity()));
        System.out.println("Map with this " + byCities);



    }
}
