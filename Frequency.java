public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2, 4};
        int target = 2;
        int count = 0;
        for (int i : arr) {
            if (i == target) count++;
        }
        System.out.println(count);
    }
}