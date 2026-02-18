import java.util.Scanner;

public class Employee {
    String name;
    int age;
    float salary;

    void setData(String name, int age, float salary) {
        if (age > 5 && salary > 10000) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            System.out.println("Data added successfully");
        } else {
            System.out.println("Invalid data");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter salary: ");
        float salary = sc.nextFloat();

        Employee emp = new Employee();
        emp.setData(name, age, salary);

        sc.close();
    }
}
