package Module2;

import Module6.ArrayUtils;
/**
 * Created by Vladymyr on 05.11.2016.
 */

public class TaskNumber1 {

    public static void main(String[] args) {

        int myArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayUtils.sum(myArr);
        ArrayUtils.min(myArr);
        ArrayUtils.max(myArr);
        ArrayUtils.maxPositive(myArr);
        ArrayUtils.multiplication(myArr);
        ArrayUtils.modulus(myArr);
        ArrayUtils.secondLargest(myArr);
    }
}

