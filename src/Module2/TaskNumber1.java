package Module2;

/**
 * Created by Vladymyr on 05.11.2016.
 */
public class TaskNumber1 {

    public static void main(String[] args) {

        int myArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        sum(myArr);
        min(myArr);
        max(myArr);
        maxPos(myArr);
        mult(myArr);
        modulus(myArr);
        secLargest(myArr);
    }

        public static void secLargest(int array[]){

        int largest = array[0];
        int secondLargest = array[0];

            for (int i = 0; i < array.length; i++) {

            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];

            }else if (array[i] > secondLargest) {
                secondLargest = array[i];

            }
        }

        System.out.println( secondLargest);

    }


    public static void modulus(int array[]){

        int modul;
        int first = array[0];
        int last = array.length - 1 ;
        modul = first % last;
        System.out.println(modul);
    }

    public static void mult(int array[]) {
        int mult = 1;
        for(int i:array)
        {
            mult*=i;
        }
        System.out.println(mult);
    }

    public static void maxPos(int array[]){
          int max = array[0];
            if(max < 0) {
                System.out.println();
            }
            else {
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                        }
                    }
                }
        System.out.println(max);
    }




    public static void max(int array[]){

        int max = array[0];
        for(int i = 1; i < array.length;i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void min(int array[]){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
         System.out.println(min);
    }




    public static void sum(int array[]) {
        int i = 0;
        int sum = 0;
        while (i < array.length) {
            sum += array[i];
            i++;


        }
        System.out.println(sum);
    }
}