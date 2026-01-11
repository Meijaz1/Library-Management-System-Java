import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {

        List<String> classList = new ArrayList<>();
        classList.add("IS147");
        classList.add("IS247");
        classList.add("IS413");

        System.out.println("Initial list:" + classList);
        System.out.println("----------------------------------");

        Collection<String> newClasses = Arrays.asList("IS300", "IS310", "IS300");
        classList.addAll(newClasses);
        System.out.println("After using addAll method:" + classList);
        System.out.println("----------------------------------");

        System.out.println("The size is " + classList.size());
        System.out.println("----------------------------------");

        classList.remove("IS247");
        System.out.println("Array  after remove method " + classList);
        System.out.println("----------------------------------");
        System.out.println("The size is " + classList.size());
        System.out.println("----------------------------------");

        System.out.println("-----USING HASHSET------");
        Set<String> classSet = new HashSet<>();
        classSet.addAll(classList);
        System.out.println("After adding array using HashSet:" + classSet);
        System.out.println("----------------------------------");
        System.out.println("The set  size is:" + classSet.size());
        System.out.println("----------------------------------");

        System.out.println("-----USING  HASHMAP------");
        Map<String, String> techMap = new HashMap<>();
        techMap.put("CSS", "style");
        techMap.put("XML", "data");
        techMap.put("HTML", "mark up");
        techMap.put("Oracle", "database");

        printDetail(techMap);

        techMap.clear();
        printDetail(techMap);
        System.out.println("----------------------------------");
    }

    public static void printDetail(Map<String, String> map) {
        System.out.println("Map: " + map);
        System.out.println("Map Size: " + map.size());
        System.out.println("Map is empty:  " + map.isEmpty());
        System.out.println("Map contains CSS key:  " + map.containsKey("CSS"));

        System.out.println("Usage:  " + map.get("CSS"));
        System.out.println("removed:  " + map.remove("CSS"));
        System.out.println();
    }
}
