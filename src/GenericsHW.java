import java.util.*;

public class GenericsHW {

    // Task 1: Generic Add Method with Upper Bound
    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    // Task 2: Lower Bound Method
    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
        System.out.println("Printing Integer or SuperClass list: " + list);
    }

    // Task 3: Upper Bound Method
    public static void printwithextend(List<? extends Number> list) {
        System.out.println("Printing with Upper Bound list: " + list);
    }

    // Task 4: Unbounded Wildcard Method
    public static void printlist(List<?> list) {
        System.out.println("Printing Unbounded list: " + list);
    }

    // Task 5: Sum Method with Upper Bound
    public static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {

        // Task 1
        int intSum = (int) add(10, 20);
        double doubleSum = add(6.5, 7.0);
        System.out.println("Sum of two integers: " + intSum);
        System.out.println("Sum of two doubles: " + doubleSum);

        // Task 2
        List<Number> intSuperList = Arrays.asList(10, 20, 30);
        printOnlyIntegerClassorSuperClass(intSuperList);

        // Task 3
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        printwithextend(doubleList);

        // Task 4
        List<String> strList = Arrays.asList("A", "B", "C");
        printlist(strList);

        // Task 5
        List<Float> floatList = Arrays.asList(2.5f, 1.0f, 4.0f);
        double totalSum = sum(floatList);
        System.out.println("Sum of Upper Bound list: " + totalSum);
    }
}
