package Module6;

/**
 * Created by Vladymyr on 09.12.2016.
 */
public class Main {
        public static void main(String[] args) {
            User[] users = new User[4];
            users[0]= new User(1, "Bob", "Red", 5500, 2000);
            users[1]= new User(2, "Josh", "Yellow", 3000, 15000);
            users[2]= new User(1, "Rob", "Rose", 5500, 2000);
            users[3]= new User(4, "Bob", "Red", 5500, 2000);

            UserUtils userUtils = new UserUtils();

            for (User user : userUtils.uniqueUsers(users)){
                System.out.println(user.getFirstName());
            }
            for (User user : userUtils.usersWithConditionalBalance(users, 7000)){
                System.out.println(user.getFirstName());
            }
        }
    }

