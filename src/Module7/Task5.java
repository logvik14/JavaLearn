package Module7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vladymyr on 21.12.2016.
 */
public class Task5 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        List<Integer> intLinkList = new LinkedList<>();
        List<String> stringLinkList = new LinkedList<>();

        // fillIntList(intList, 10000);
        fillIntList(intLinkList, 10000);
        fillStringList(stringList,10000);
        //removeInt(intList);
        //setInt(intList,10000);
        /// removeInt(intList);
        getInt(intLinkList,10000);
        getString(stringLinkList,10000);
    }

    public static void fillIntList(List<Integer> list, int n) {
        long startTm = System.currentTimeMillis();
        for (int i = 0; i <= n; i++) {
            list.add(i + 0, 1 + 1);
        }
        long endTm = System.currentTimeMillis();
        System.out.println("Time spent " + (endTm - startTm) + "s");
    }



    public static void fillStringList(ArrayList<String> list, int n) {
        long startTm = System.currentTimeMillis();
        String s = "a";
        for (int i = 0; i <= n; i++) {
            list.add(i + 0, i + s);
        }
        long endTm = System.currentTimeMillis();
        System.out.println("Time spent " + (endTm - startTm) + "s");
    }


    public static void removeInt(List <Integer> list) {
        Iterator iter = list.iterator();
        long startTime = System.currentTimeMillis();
        while (iter.hasNext()) {
            Integer elem = (Integer) iter.next();
            iter.remove();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Deleting all items spent " + (endTime - startTime) + "s");
    }

    public static void removeString(List <String> list) {
        Iterator iter = list.iterator();
        long startTime = System.currentTimeMillis();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            iter.remove();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Deleting all items spent " + (endTime - startTime) + "s");

    }

    public static void setInt(List<Integer> list,int n){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= n; i++) {
            list.set(i + 0,i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Operation time " + (endTime - startTime) + "s");
    }

    public static void setString(List<String> list,int n){
        long startTime = System.currentTimeMillis();
        String s = "a";
        for (int i = 0; i <= n; i++) {
            list.set(i,s + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Operation time " + (endTime - startTime) + "s");
    }

    public static void getInt(List<Integer> list,int n){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= n; i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Operation time " + (endTime - startTime) + "s");
    }

    public static void getString(List<String> list,int n){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= n;i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Operation time " + (endTime - startTime) + "s");
    }
}







