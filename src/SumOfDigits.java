 // Mahrukh Eijaz meijaz1@umbc.edu
public class SumOfDigits {

    public static int sumOfNumbers(int value) {
        if (value == 0) {
            return 0;
        }
        return (value % 10) + sumOfNumbers(value / 10);
    }

    public static void main(String[] args) {
        int number = 12345; // Input number
        int sum = sumOfNumbers(number); // Call recursive method
        System.out.println("The sum of " + number + " = " + sum + " using recursion");
    }
}