package day2;

public class ExampleOne {
    public static void main(String[] args) {

        int number = 3054;

        int digit1 = number / 1000;

        int digit2 = number / 100 % 10;

        int digit3 = number / 10 % 10;

        int digit4 = number % 10;

        System.out.println(digit1 + digit2 + digit3 + digit4);

    }
    
}
