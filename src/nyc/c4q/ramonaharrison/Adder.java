package nyc.c4q.ramonaharrison;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Adder.java
 *
 */

public class Adder {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me some numbers to add:");
        while (true) {
            int nextNumber = sc.nextInt();
            if (nextNumber == -2)
                break;
            if (nextNumber == -1)
                numbers.clear();
            else
                numbers.add(nextNumber);
        }

        // for each loop
//        int sum = 0;
//        for (int n : numbers) {
//            sum += n;
//        }
        //System.out.println("Sum: " + sum);


        // new iterator object
        Iterator<Integer> numsIter = numbers.iterator();
        int itSum = 0;
        while (numsIter.hasNext()) {
            itSum += numsIter.next();

        }
        System.out.println("Sum: " + itSum);



    }
}
