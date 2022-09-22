package day5;

import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        //Scanner class is used to read the data from the keyboard (type of variable). It is an object type but not a primitive type
        Scanner in = new Scanner(System.in);
        //System.in represents the keyboard

        double radius;

        System.out.println("Please enter the radius: ");
        radius = in.nextDouble();
        //in.nextDouble lets you use a double number

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle of radius " + radius + " is: " + area);

        in.close();
        //Used to close the in so you dont get an error (it is not necessary)
    }
}
