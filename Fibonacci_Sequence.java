public class Fibonacci_Sequence {
    public static void main(String[] args) {
        int target = 7, result;
        int a = 1, b = 1, tmp;
        for (int i = 1; i < target; i++) {
            tmp = a + b;
            a = b;
            b = tmp;
        }
        result = a;
        System.out.println(result);
    }
}
