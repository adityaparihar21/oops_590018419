import java.util.Scanner;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        String value, newValue;

        do {
            System.out.println("\n--- SORTED SET (TreeSet) MENU ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Traverse");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1: // Insert
                    System.out.print("Enter value to insert: ");
                    value = sc.nextLine();
                    if (set.add(value)) {
                        System.out.println("Inserted successfully.");
                    } else {
                        System.out.println("Value already exists.");
                    }
                    break;

                case 2: // Delete
                    System.out.print("Enter value to delete: ");
                    value = sc.nextLine();
                    if (set.remove(value)) {
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;

                case 3: // Update
                    System.out.print("Enter value to update: ");
                    value = sc.nextLine();
                    if (set.contains(value)) {
                        set.remove(value);
                        System.out.print("Enter new value: ");
                        newValue = sc.nextLine();
                        set.add(newValue);
                        System.out.println("Updated successfully.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;

                case 4: // Search
                    System.out.print("Enter value to search: ");
                    value = sc.nextLine();
                    if (set.contains(value)) {
                        System.out.println("Value found.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;

                case 5: // Traverse
                    System.out.println("Sorted elements:");
                    for (String item : set) {
                        System.out.println(item);
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}