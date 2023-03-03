import java.util.Scanner;
import java.util.SortedMap;

public class HW3_1 {

    public static void main(String[] args) {

        //Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным
        // на ваш выбор и вывести следующие строки:
        //a == b - если переменные равны
        //a < b - если переменная a меньше b
        //a > b - если переменная b меньше a

        int a;
        Scanner num1 = new Scanner(System.in);
        System.out.println("Whats the first numо: ");
        a = num1.nextInt();

        int b;
        Scanner num2 = new Scanner(System.in);
        System.out.println("Whats the second num: ");
        b = num2.nextInt();

        if (a == b) {
            System.out.println("a == b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("b > a");
        }

        //Задача №2
        //
        //Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным
        // на ваш выбор и вывести следующие строки:
        //maybe a and b are even - если сумма переменных четная
        //some variable is odd - если сумма переменных нечетная

        Scanner num3 = new Scanner(System.in);
        System.out.println("Whats the num1 ");
        int c = num3.nextInt();

        Scanner num4 = new Scanner(System.in);
        System.out.println("Whats the num2 ");
        int d = num4.nextInt();

        if ((c + d) % 2 == 0) {
            System.out.println("Maybe num1 or num2 are even");
        } else {
            System.out.println("Maybe num1 or num2 is odd");
        }

        //Задача №3
        //
        //Необходимо создать целочисленную переменную, присвоить произвольное значение
        // переменной на ваш выбор и вывести следующие строки:
        //больше 10 - если переменная больше 10
        //меньше 100 - если переменная меньше 100
        //результат деления на 2 больше 20 - если это соответствует истине
        //значение переменной между 5 и 40 включительно - если это правда
        //значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
    }

}
