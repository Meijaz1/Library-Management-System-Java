public class Contact implements Comparable<Contact> {
    private String firstName;
    private String lastName;
    private String phone;

    // Constructor
    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.phone     = phone;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }

    // Format: "LastName,FirstName phone"
    @Override
    public String toString() {
        return lastName + "," + firstName + " " + phone;
    }

    /**
     * compareTo() that sorts by LAST name, then FIRST name.
     * (Matches the sample output in your screenshot.)
     */
    @Override
    public int compareTo(Contact other) {
        // Compare last names first
        int lastCompare = this.lastName.compareToIgnoreCase(other.lastName);
        if (lastCompare != 0) {
            return lastCompare;
        }
        // If last names match, compare by first name
        return this.firstName.compareToIgnoreCase(other.firstName);
    }
}
