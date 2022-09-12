package day3;

public class ExampleThree {
    public static void main(String[] args) {
        int x = 17;

        System.out.println("Remainder: " + (x % 5));
        System.out.println("Division: " + (x / 5));


        int number = 57856;
        /*
        int digit1 = number / 10000; //answer is 5
        int digit2 = number / 1000 % 10; //57856 / 1000 = 57 % 10 = 7
        int digit3 = number / 100 % 10; //57856 / 100 = 578 % 10 = 8
        int digit4 = number / 10 % 10; //57856 / 10 = 5785 % 10 = 5
        int digit5 = number % 10; //answer is 6
        */

        int digit1 = number / 10000;
        int digit2 = number % 10000 / 1000; 
        int digit3 = number % 1000 / 100; 
        int digit4 = number % 100 / 10;
        int digit5 = number % 10;
        //we can only do this because it is base 10

        int sum = digit1 + digit2 + digit3 + digit4 + digit5;
        System.out.println(sum);

        //% = modulus
        //% 10 = the last digit of any number

        //what is the sum or the individual digits?
        //ie. 5 + 7 + 8 + 5 + 6 = 31

    }
}
