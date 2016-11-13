package Module3.Fourth;

/**
 * Created by Vladymyr on 12.11.2016.
 */
public class User {
    public static void main(String[] args) {
        User user = new User("Vova",2000,4,"Chashka",400,"dollars");
        user.paidSalary();
    }


    private  static String name;
    private static int balance;
    private static  int monthsOfEmployment;
    private static String companyName;
    private static int salary;
    private static String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }


    public static void getName() {

        System.out.println(name);
    }

    public  void setName(String name)
    {
        this.name = name;
    }

    public static void getBalance() {

        System.out.println(balance);
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }

    public static void getMonthsOfEmployment()
    {
        System.out.println(monthsOfEmployment);
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public static void getCompanyName() {
        System.out.println(companyName);
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static void getSalary() {
        System.out.println(salary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void getCurrency() {
        System.out.println(currency);
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }



    public static void paidSalary() {
          balance = balance + salary;
        System.out.println(balance);

    }


        public static  void  monthIncreaser (int addMonth){
            monthsOfEmployment = monthsOfEmployment + addMonth;

            System.out.println(monthsOfEmployment);
    }

         public static void companyNameLength(){

        int a = companyName.length();
             System.out.println(a);

    }


       public static void  widthDraw(int summ) {
        int commision = 5 / summ * summ;
        int result = 0;
        if (balance < 1000) {
            result  = balance - commision;

        } else if (balance > 1000) {
            commision = 10 / summ * summ;
            result = balance - commision;
        }
           System.out.println(result);

    }

}







