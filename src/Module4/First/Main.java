package Module4.First;


public class Main {
    public static void main(String[] args) {

        USBank us1 = new USBank(100, "Ukr", Currency.USD, 21, 1.700, 200, 122000);
        USBank us2 = new USBank(10, "Rus", Currency.EUR, 25, 1.400, 100, 33344000);
        EUBank eu1 = new EUBank(101, "Ukr", Currency.USD, 22, 1.500, 200, 55451500);
        EUBank eu2 = new EUBank(75, "Ukr", Currency.EUR, 24, 1.400, 200, 65651000);
        ChinaBank ch1 = new ChinaBank(80, "Mol", Currency.USD, 23, 1.700, 200, 23322000);
        ChinaBank ch2 = new ChinaBank(700, "ENG", Currency.EUR, 23, 1.200, 90, 213213000);

        User user1 = new User(12321256L, "Petia", 213, 2, "Google", 13000, us1);
        User user2 = new User(321321746389L, "Alex", 341, 3, "LikeLo", 4000, us2);
        User user3 = new User(323193726L, "Lesha", 182, 4, "CNN", 52000, eu1);
        User user4 = new User(123213848L, "Natasha", 1004, 50, "Mercedes", 1100, eu2);
        User user5 = new User(4545783783L, "Masha", 1456, 1, "Adidas", 23000, ch1);
        User user6 = new User(21321788439L, "Vania", 35640, 23, "Nike", 50000, ch2);

        BankSystImpl implementation = new BankSystImpl();

        implementation.transferMoney(user1,user4,2000);
        System.out.println(user4.getBalance());
    }
}


    // не понимаю почему не работает







