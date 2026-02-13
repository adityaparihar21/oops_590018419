class subject {
    int sum(int a, int b) {
        return a+b;
    }

    int sum(int c, int d, int e) {
        return c+d+e;
    }
}

class Student extends subject {
    @Override
    int sum(int a, int b) {
        return a-b;
    }

    int display() {
        int v = super.sum(4, 5);
        return v;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        subject d = new subject();
        Student e = new Student();
        System.out.println(e.sum(2, 3));
        System.out.println(e.display());
    }
}
