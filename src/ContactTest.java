public class ContactTest {

    // Selection sort using the compareTo() method
    public static void selectionSort(Comparable[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                // If current element < smallest so far, update minIndex
                if (list[j].compareTo(list[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            Comparable temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        // Create an array of 6 Contacts (to match your screenshot output)
        Contact[] friends = new Contact[6];

        friends[0] = new Contact("Sarah", "Baners", "123-785-4752");
        friends[1] = new Contact("Laura", "Getz", "675-343-2321");
        friends[2] = new Contact("Frank", "Phelps", "675-343-2321");
        friends[3] = new Contact("Mark",  "Riley",  "675-343-2321");
        friends[4] = new Contact("John",  "Smith",  "456-232-4567");
        friends[5] = new Contact("Larry", "Smith",  "675-343-2321");

        // Sort using selection sort
        selectionSort(friends);

        // Print the sorted contacts
        for (Contact c : friends) {
            System.out.println(c);
        }
    }
}
