package Module2;

/**
 * Created by Vladymyr on 07.11.2016.
 */
public class TaskNumber2 {

    public static void main(String[] args) {
        Bank(30, 20);
    }

     public static void Bank(int money, int widthdrawal) {
         int modul = money % widthdrawal;
         double commision = widthdrawal * 0.05;
         double finBal = money - widthdrawal - commision;

            if((money > 0) &&(modul > commision)&&(widthdrawal < money)){
                 System.out.println("OK " + commision + " " + finBal);
         }  else{
                System.out.println("NO");
         }

     }
 }








