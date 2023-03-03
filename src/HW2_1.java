import java.util.Scanner;

public class HW2_1 {
    public static void main(String[] args){
        // Задача №1
        //
        //Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор
        // и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление.
        int a = 35;
        int b = 55;

        System.out.println(a * b);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println((double)a/ b);


        // Экстра задача
        //
        //Также вывести остаток от деления и сделать проверку на четность этих переменных.
        //
        //
        //Экстра задача
        //
        //Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).

        int c;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число: ");
        c = num.nextInt();

        if (c / 16 % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        // Экстра задача
        //
        //Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).

        char smile = '\u1601';
        System.out.println(smile);
    }

    public static boolean isTeen(int nr1){
        return (nr1 >= 13 && nr1 <= 19);
    }

    public static boolean hasTeen(int nr1, int nr2, int nr3){
        return isTeen(nr1) || isTeen(nr2) || isTeen(nr3);
    }
}
