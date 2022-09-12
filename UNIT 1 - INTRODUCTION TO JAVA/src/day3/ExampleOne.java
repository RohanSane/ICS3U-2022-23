package day3;

public class ExampleOne {
    public static void main(String[] args) {
        
        //Variables allow us to store data/information
        //We must declare the variable and the TYPE of data it will store

        //Primative Data Types:
        //int -> integer (have no decimal)
        //double -> decimal numbers
        //char -> characters
        //boolean -> true/fals

        //naming convention for variables -> (camelCase)

        int numberOfStudents = 13; //= assignemnt operator (it assigns a value to a variable)
        //int age = 17.9;    cannot convert a double to an int. 17.9 is a double and age is an int
        //yellow squigly lines in VS cod
        double averageAge = 18.3; 
        
        System.out.println(numberOfStudents);
        System.out.println(averageAge);
        System.out.println(5 + 3);

        // as good practice, declare variables as you need them
        int numberOne, numberTwo, numberThree; //you can declare multiple variables of the same type on the same line

        numberOne = 10;
        numberTwo = 16;
        numberThree = 11;

        int sum = numberOne + numberTwo + numberThree;

        System.out.println("The sum is " + sum); //string concatenation (joining something to a string usin +)

        
    }
    
}
