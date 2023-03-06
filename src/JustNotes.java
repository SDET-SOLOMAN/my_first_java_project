import java.util.Scanner;

public class JustNotes {

    // PRIMITIVE TYPES:

    // Integral Types:
    // byte     1 Byte = 8 BITS       - 128 to 127                              0
    // short    2 Byte = 16 BITS      - 32768 to 32767                          0
    // int      4 BYTES = 32 BITS     - 2.14 Billion to 2.14 Billion            0
    // Long     8 BYTES = 64 BITS

    // Floating Point Type:
    // float    4 BYTES = 32 BITS                                               0.0f
    // Double   8 BYTES = 64 BITS                                               0.0D

    //Boolean   ?                                                               false

    // Char     2 BYTES = 16 BITS       0 to 65535                              \u0000

//
//
//        byte a = Byte.MAX_VALUE;
//        byte b = Byte.MIN_VALUE;
//        System.out.println("Byte min value is " + b + " and byte max value is " + a);
//        System.out.println("Byte has width of " + Byte.SIZE);
//
//        short aa = Short.MAX_VALUE;
//        short bb = Short.MIN_VALUE;
//        System.out.println("Short min value is " + bb + " and short max value is " + aa);
//        System.out.println("Short has width of " + Short.SIZE);
//
//        int aaa = Integer.MAX_VALUE;
//        int bbb = Integer.MIN_VALUE;
//        System.out.println("Integer min value is " + bbb + " and integer max value is " + aaa);
//        System.out.println("Integer has width of " + Integer.SIZE);
//
//        long aaaa = Long.MAX_VALUE;
//        long bbbb = Long.MIN_VALUE;
//        System.out.println("Long min value is " + bbbb + " and Long max value is " + aaaa);
//        System.out.println("Long has width of " + Long.SIZE);
//
//        // Floating point: float and double
//
//        float flMax = Float.MAX_VALUE;
//        float flMin = Float.MIN_VALUE;
//        System.out.println("Float min value is " + flMin + " and Float max value is " + flMax);
//        System.out.println("FLoat has width of " + Float.SIZE);
//
//        double doubleMax = Double.MAX_VALUE;
//        double doubleMin = Double.MIN_VALUE;
//        System.out.println("Double min value is " + doubleMin + " and Double max value is " + doubleMax);
//        System.out.println("Double has width of " + Double.SIZE);
//
//        // Single Character: char
//
//        char charMax = Character.MAX_VALUE;
//        char charMin = Character.MIN_VALUE;
//        System.out.println("Char min value is " + charMin + " and Char max value is " + charMax);
//        System.out.println("Char has width of " + Character.SIZE);
//

    // -----------

    // integers:
    //
    //  a = a ^ b ^ (b = a)

    // ------------

    // Strings and String Methods

    // System.out.printf("His name is %d and last name is %d", a, b);
    // System.out.printf("His name is %3$s %1$d and last name is %1$d", a, b, string name);
    // %6.2f

    // %[argument_index][flags][width][.precession]conversion
    // argument_index - 1$, 2$, 3$ ....
    // flag '-', '+', '0', '', '('

    // conversion:
    // char - c
    // int d - decimal, o - octal, x - hexdecimal
    // float - f, e, g
    // String - s

    // Methods:
    // int length()
    // string toLowerCase()
    // string toUpperCase()
    // string trim()
    // string substring(int begin) or (int begin,int stop)
    // string replace(char old, char new)
    // boolean startsWith(String s) also can use starting index ("Jame", 8)
    // boolean endsWith(String s)
    // char charArt(ind index)
    // int indexOf(String s)
    // int last indexOf(String s) from right to left ("s", <- 6)
    // boolean equals(String s)
    // boolean equalsIgnoreCase(String s)
    // int compareTo(String s) char checker which char comes first, returns 1 or -1
    // string valueOf(int i) convert to str



/*  -------------

       Scanners:

       Types: nextLine(multiple words), next(one word), nextInt, nextFloat, nextLong, nextShort,
       nextLine, nextBoolean

        int a, b;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter 2 nums ");
        a = myScanner.nextInt();
        b = myScanner.nextInt();
        System.out.println(a + " and " + b);


        multiple Scanner:
        Scanner myScanner = new Scanner(System.in);

        int a1, b1;
        double d1, d2;

        System.out.println("Select a number amigo: ");

        a1 = myScanner.nextInt();
        b1 = myScanner.nextInt();
        d1 = myScanner.nextDouble();
        d2 = myScanner.nextDouble();
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(d1);
        System.out.println(d2);


       Scanner myScanner = new Scanner(System.in);
       System.out.println("Whats the num1 ");
       int c = myScanner.nextInt();

       public static String captureName() {
        Scanner letMeAsk = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = letMeAsk.nextLine();
        return name;
    }


        */



    // ------

    // pre-increment ++ x || post increment x ++

    // ------

    // Bitwise operators:
    // &&, ||, ^^ exlussive or, ~ not, << left shit 1 shift * 2, 2 shift * 4, etc, >> shift divide.

    // -------

}
