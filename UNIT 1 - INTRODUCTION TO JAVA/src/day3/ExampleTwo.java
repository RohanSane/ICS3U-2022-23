package day3;

public class ExampleTwo {
    public static void main(String[] args) {
        int numberOne = 16, numberTwo = 17, numberThree = 19;
        int numStudents = 3;

        //because all the variables are ints we need to temporairily treat something as a double before the division to we can get a double division.
        //(type) variable -> will cast the variable as the type
        double averageAge = (numberOne + numberTwo + numberThree) / (double) numStudents;
        //double averageAge = (double) (numberOne + numberTwo + numberThree) / numStudents;
        //this could also work because casting happens before devision

        //cast -> temporairily turning a type into another type
        //(double) -> how you cast

        //AP Test Question:
        // double / int = double
        // int / double = double
        // double / double = double
        // int / int = int

        System.out.println("Average age is " + averageAge);

        int x = 6;
        int y = 7;

        System.out.println("The sum of " + x + " and " + y + " is " + (x + y));

        //System.out.println("The sum of " + x + " and " + y + "is" + x + y);
        //"The sum of 6 and 7 is 67"
    }
    
}
