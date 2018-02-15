import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PositiveNumbers {
    static int typed;
    static int sum;
    static int minValue;
    static int maxValue;

    public static void main(String[] args) {

        ArrayList<Integer> arrayOfPositiveNumbers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        boolean doTill = true;

        do {
            System.out.println("Give a positive number and add to the list or negative and stop the program: ");
            typed = sc.nextInt();
            if (typed < 0) {
                doTill = false;
            } else
                arrayOfPositiveNumbers.add(typed);
        } while (doTill);

        sc.close();

        // print all numbers in reverse order
        System.out.println("All given numbers in reverse order: ");
        for (int i = arrayOfPositiveNumbers.size() - 1; i >= 0; i--) {
            System.out.print(arrayOfPositiveNumbers.get(i));
        }
        System.out.println("");

        // calculate sum of all given numbers
        for (int i = 0; i < arrayOfPositiveNumbers.size(); i++) {
            sum += arrayOfPositiveNumbers.get(i);
        }

        // print calculation and result
        for (int i = 0; i < arrayOfPositiveNumbers.size(); i++) {
            System.out.printf("%d", arrayOfPositiveNumbers.get(i));
            if (!(i == arrayOfPositiveNumbers.size() - 1)) {
                System.out.print("+");
            }
        }
        System.out.print("=" + sum + "\n");

        // find min value
        int firstValue = arrayOfPositiveNumbers.get(0);
        for (int i = 0; i < arrayOfPositiveNumbers.size(); i++) {
            if (arrayOfPositiveNumbers.get(i)  < firstValue) {
                minValue = arrayOfPositiveNumbers.get(i);
            } else {
                minValue = firstValue;
            }
        }

        // find max value
        maxValue = 0;
        for (int i = 0; i < arrayOfPositiveNumbers.size(); i++) {
            if (arrayOfPositiveNumbers.get(i) > maxValue) {
                maxValue = arrayOfPositiveNumbers.get(i);
            }
        }

        // print min value
        System.out.println("Minimum value is: " + minValue);

        // print max value
        System.out.println("Maximum value is: " + maxValue);
    }
}
