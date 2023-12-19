import java.util.Scanner;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Task1. buffetSays();
        Task2. methodOddNumber();
        }

class Task1 {
    //Написать метод, который отображает отформатированный текст/
    public static void buffetSays() {
        System.out.println(" " " + "Someone,s sitting in the shade today ");
        System.out.println("because someone planted a three a long time ago" + " >> ");
        System.out.println("Warren Buffet.");
    }
}
    class Task2 {
            // Напишите метод, который принимает два числа в качестве параметра и отображает все четные числа между ними
        //number = C.methodThatReturnSomeOfNumber(50, 50);
        static int methodOddNumber(int firstNum, int secondNum){
            Scanner scanner = new Scanner(System.in);
            int firstNum = scanner.nextInt();
            System.out.println("Введите первое число");
            if (firstNum % 2 == 0) {
                System.out.println("Четные номера" + firstNum);
            } else if (firstNum % 2 != 0) {
                System.out.println("Первое число не является четным");
            }
            int secondNum = scanner.nextInt();
            System.out.println("Введите второе число");
            if (secondNum % 2 == 0) {
                System.out.println("Четные номера" + secondNum);
            } else if (secondNum % 2 != 0) {
                System.out.println("Первое число не является четным");

                IntStream.range(firstNum, secondNum).forEach(System.out::println);
                int [] allNumber = {firstNum, secondNum}
                for (int i = 0; i < arr.length; i++)
                    ;
                System.out.println(allNumber);



             /*int firstNum = 10;
            int secondNum = 15;*//*
            int result = firstNum+secondNum;
            return result;*/

        }



    }

    }





