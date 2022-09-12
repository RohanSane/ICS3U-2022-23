package day3;

public class ExampleFour {
    public static void main(String[] args) {
        int x = 7;
        x = x + 1; //x is assigned x + 1 -> because of order of operations assignment is always last
        System.out.println(x);

        int numberofStudents = 26;
        numberofStudents = numberofStudents + 1; 
        numberofStudents++; //same as the line above
        System.out.println(numberofStudents);

        numberofStudents--;
        System.out.println(numberofStudents);

        //-- -> subtracts one
        //++ -> adds one

        numberofStudents = numberofStudents / 3;
        numberofStudents /= 3;//does the same as the line above

        // +=
        // -=
        // /=
        // %=
        //These operators will perform that operation on the variable and then reassign that value to the variable
    }
}
