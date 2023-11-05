package sayları.karşılaştırma;

import java.util.Scanner;

public class SaylarıKarşılaştırma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give 3 value to compare:");

        int number1 = input.nextInt();
        System.out.println("number1=" + number1);
        int number2 = input.nextInt();
        System.out.println("number2=" + number2);
        int number3 = input.nextInt();
        System.out.println("number3=" + number3);

        ifblogu.compareclass(number1, number2, number3);

    }
}

class ifblogu {

    public static void compareclass(int number1, int number2, int number3) {
        if (number1 == number2 && number1 == number3) {
            System.out.println(number1 + "=" + number2 + "=" + number3);
        } else if (number1 == number2 && number1 > number3) {
            System.out.println(number1 + "=" + number2 + ">" + number3);

        } else if (number2 == number3 && number2 > number1) {
            System.out.println(number2 + "=" + number3 + ">" + number1);
        } else if (number1 == number3 && number1 > number2) {
            System.out.println(number1 + "=" + number3 + ">" + number2);
        } else if (number1 > number2 && number1 > number3) {

            if (number2 > number3) {
                System.out.println(number1 + ">" + number2 + ">" + number3);
            } else {
                System.out.println(number1 + ">" + number3 + ">" + number2);
            }

        } else if (number2 > number3 && number2 > number1) {
            if (number1 > number3) {
                System.out.println(number2 + ">" + number1 + ">" + number3);
            } else {
                System.out.println(number2 + ">" + number3 + ">" + number1);
            }

        } else if (number3 > number1 && number3 > number2) {
            if (number1 > number2) {
                System.out.println(number3 + ">" + number1 + ">" + number2);
            } else {
                System.out.println(number3 + ">" + number2 + ">" + number1);
            }

        }
    }

}
