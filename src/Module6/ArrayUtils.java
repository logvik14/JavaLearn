package Module6;

/**
 * Created by Vladymyr on 09.12.2016.
 */
public final class ArrayUtils {

    public  static int sum(int array[]) {
        int i = 0;
        int sum = 0;
        while (i < array.length) {
            sum += array[i];
            i++;


        }
        return sum;
    }


    public  static  int min(int array[]){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public  static  int secondLargest(int array[]){

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

        return secondLargest;

    }


    public  static int modulus(int array[]){

        int modul;
        int first = array[0];
        int last = array.length - 1 ;
        modul = first % last;
        return modul;
    }

    public  static int multiplication(int array[]) {
        int mult = 1;
        for(int i:array)
        {
            mult*=i;
        }
        return mult;
    }

    public  static int maxPositive(int array[]){
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
        return max;
    }




    public  static int max(int array[]){

        int max = array[0];
        for(int i = 1; i < array.length;i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int[] findEvenElements(int[] array){
        int count = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                count++;
            }
        }
        int[] evens = new int[count];
        int index = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                evens[index] = elem;
                index++;
            }
        }
        return evens;
    }

    public static int[] reverse(int[] array){
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

}
