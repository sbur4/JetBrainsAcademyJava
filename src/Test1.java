import java.util.Scanner;

/**
 * @author sburch
 * @version jdk-11.0.11.9
 */

/*
 * Medium level. Write a program that will help people who are going on
 * vacation. The program should calculate the total required sum (e.g. $) of
 * money to have a good rest for a given duration.
 * 
 * There are four parameters which have to be considered:
 * 
 * duration in days, total food cost per day, one-way flight cost, cost of one
 * night in a hotel (the number of nights equal duration minus one)
 * 
 * Read values of these parameters from the standard input and then print the
 * result.
 * 
 * Sample Input 1: 7 30 100 40
 * 
 * Sample Output 1: 650
 */

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        System.out.println("Enter duration in days:");
        int daysDuration = scanner.nextInt();
        System.out.println("Enter food cost per day:");
        int totalFoodCost = scanner.nextInt();
        System.out.println("Enter one-way flight cost:");
        int oneWayFlightCost = scanner.nextInt();
        System.out.println("Enter cost of one night in a hotel:");
        int hotelOneNightCost = scanner.nextInt();
        System.out.print("Sum of money to have a good rest for a given duration: ");
        System.out.println(
                (daysDuration * totalFoodCost) + ((daysDuration - 1) * hotelOneNightCost) + (oneWayFlightCost * 2));
        scanner.close();
    }

}
