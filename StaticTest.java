public class StaticTest {
    static int staticVar = 100;
    int nonStaticVar = 200;

    public static void main(String[] args) {
        System.out.println(staticVar);
        StaticTest obj = new StaticTest();
        System.out.println(obj.nonStaticVar);
    }
}