package Module3.Second;

/**
 * Created by Vladymyr on 12.11.2016.
 */
public class Adder extends Arithmetic {
    public static void main(String[] args) {

        add(3,2);

    }


    public static boolean check(Integer a, Integer b) {
        if(a >= b)
            return true;
        else
            return false;
    }
}
