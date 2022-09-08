package day2;

//Examples about Escape Sequences

//Naming Conventions:
//Folders (packages): all lower case with no spaces
//Classes: UpperCase on first letter of each word (Pascal Case)
//methods/functions (variables): camelCase all lower case execpt the first leeter of each word except the first word

//Constants: ALL upper case _ to distinguish words (ex. NUM_STUDENTS)

public class ExampleTwo {
    public static void main(String[] args) {

        //We must escape the " inside the round brackets because double quotes have meaning in java
        //single quotes have no meaning in java
        // \ used to escape a characters regular meaning

        System.out.println("Computer Science is the \"Best\" Course Ever");
        
        //there are a small subset of characters that can be escaped
        //BUT the AP Exam will only text you on 3 of them \\ \" \n

        System.out.println("This is \\a test.");

        //to display a backslash you must exape it using \\

        System.out.println("ABCD\nEFGHIJK");
            }
}
