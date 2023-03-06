public class LessonThreeForWhileDoWhile {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // My solution
        a = a + b;  // a = 15
        b = a - b;  // b = 5
        a = a - b;  // a = 10

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Google's Solution
        a = a ^ b ^ (b = a);

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }



}
