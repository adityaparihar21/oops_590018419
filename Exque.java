import java.util.Scanner;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class Employee {
    String name;
    int age;
    float salary;

    void setData(String name, int age, float salary) throws MyException {

        if (name.length() > 20) {
            throw new MyException("Name should be max 20 characters");
        }

        if (age <= 5) {
            throw new MyException("Age must be greater than 5");
        }

        if (salary <= 1200000) {
            throw new MyException("Salary must be greater than 1200000");
        }

        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

// Main class (same as file name)
public class Exque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter salary: ");
            float salary = sc.nextFloat();

            e.setData(name, age, salary);
            e.display();

            System.out.println("Data inserted successfully");

        } catch (MyException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
