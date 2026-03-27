import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice, key;
        String value;

        do {
            System.out.println("\n--- MAP (HashMap) MENU ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Traverse");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: // Insert
                    System.out.print("Enter key (int): ");
                    key = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter value (String): ");
                    value = sc.nextLine();

                    if (!map.containsKey(key)) {
                        map.put(key, value);
                        System.out.println("Inserted successfully.");
                    } else {
                        System.out.println("Key already exists.");
                    }
                    break;

                case 2: // Delete
                    System.out.print("Enter key to delete: ");
                    key = sc.nextInt();

                    if (map.remove(key) != null) {
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 3: // Update
                    System.out.print("Enter key to update: ");
                    key = sc.nextInt();
                    sc.nextLine();

                    if (map.containsKey(key)) {
                        System.out.print("Enter new value: ");
                        value = sc.nextLine();
                        map.put(key, value);
                        System.out.println("Updated successfully.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 4: // Search
                    System.out.print("Enter key to search: ");
                    key = sc.nextInt();

                    if (map.containsKey(key)) {
                        System.out.println("Value = " + map.get(key));
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 5: // Traverse
                    System.out.println("Map elements:");
                    for (Map.Entry<Integer, String> entry : map.entrySet()) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
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