class Student {
    int id;
    String name;
}

public class arrayobj {
    public static void main(String[] args) {

        // Creating array of objects
        Student[] s = new Student[3];

        // Creating objects
        s[0] = new Student();
        s[1] = new Student();
        s[2] = new Student();

        // Assigning values
        s[0].id = 1;
        s[0].name = "Aditya";

        s[1].id = 2;
        s[1].name = "Rahul";

        s[2].id = 3;
        s[2].name = "Aman";

        // Displaying values
        for(int i = 0; i < s.length; i++) {
            System.out.println("ID: " + s[i].id + " Name: " + s[i].name);
        }
    }
}