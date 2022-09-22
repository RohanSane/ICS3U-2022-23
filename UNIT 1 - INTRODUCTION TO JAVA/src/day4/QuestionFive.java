package day4;

public class QuestionFive {
    public static void main(String[] args) {
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.1;
        double quarter = 0.25;
        int loonie = 1;
        int toonie = 2;

        double tpennies = penny * 5;
        double tnickel = nickel* 7;
        double tdime = dime * 10;
        double tquarter = quarter * 11;
        int tloonie = loonie * 2;
        int ttoonie = toonie * 6;

        double money = tpennies + tnickel + tdime + tquarter + tloonie + ttoonie;

        System.out.println("The total amount of money the user had is $" + money);
    }
    
}
