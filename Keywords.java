class Parent {
    int val = 50;
}

class Child extends Parent {
    int val = 10;
    void display() {
        System.out.println(this.val);
        System.out.println(super.val);
    }
}

public class Keywords {
    public static void main(String[] args) {
        new Child().display();
    }
}