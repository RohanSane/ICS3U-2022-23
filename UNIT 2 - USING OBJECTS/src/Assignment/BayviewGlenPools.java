import java.util.Scanner;

public class BayviewGlenPools {
    public static void main(String[] args) {

        //Scanner To Get Values From The User

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the length of the pool: ");
        int length = in.nextInt();

        System.out.println("Please enter the width of the pool: ");
        int width = in.nextInt();

        System.out.println("Please enter the height of the shallow side of the pool: ");
        int shallowheight = in.nextInt(); 
        
        System.out.println("Please enter the height of the deep side of the pool: ");
        int deepheight = in.nextInt();

        System.out.println("Please enter the length of the transition of the pool: ");
        int transition = in.nextInt();

        System.out.println("Please enter the length of the shallow end of the pool: ");
        int shallowlength = in.nextInt();

        System.out.println("Please enter the cost of the liner: ");
        int linercost = in.nextInt();

        int transitionheight = deepheight - shallowheight;
        double trianglebase = Math.sqrt(Math.pow(transition, 2) - Math.pow(transitionheight, 2));
        double deeplength = length - shallowlength - trianglebase;
        double bottomlength = shallowlength + transition + deeplength;


        //Finding The Surface Area
        double bottom = bottomlength * width;
        int side1SA = shallowheight * width;
        int side2SA = deepheight * width;

        double rectangle1SA =  (shallowlength + trianglebase) * shallowheight;
        double triangle1SA = (trianglebase * transitionheight) / 2.0;
        double rectangle3SA = ((length - trianglebase) - shallowlength) * deepheight;

        double side34SA = 2 * (rectangle1SA + triangle1SA + rectangle3SA);

        double linerneeded = side1SA + side2SA + side34SA + bottom;

        System.out.println("The total amount of liner needed is " + Math.round(linerneeded*100.0)/100.0 + " meters squared.");
 

        //Finding The Cost Of The Liner
        double totallinercost = linerneeded * linercost;
        
        System.out.println("The total cost of the liner needed is $" + Math.round(totallinercost*100.0)/100.0 + ".");

       
        //Finding The Volume
        double rectangle1V = rectangle1SA * width;
        double rectangle3V = rectangle3SA * width;
        double triangle1V = (trianglebase * transitionheight * width) / 2;

        double volume = rectangle1V + rectangle3V + triangle1V; 

        //Calculating 90% Of The Volume
        double waterneeded = volume * 0.9;
        
        System.out.println("The amount of water needed to keep the pool 90% full is " + Math.round(waterneeded*100.0)/100.0 + " meters squared.");

        in.close();;
    }
}
