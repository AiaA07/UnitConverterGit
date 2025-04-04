import java.util.Scanner;

public class Weight {

    Scanner scan  = new Scanner(System.in);

    public double ConvertKgToPound(){
        System.out.println("Enter a number in Kilograms: ");
        int kg = scan.nextInt();
        double lb = kg*2.2046;
        return lb;
    }

    public double ConvertPoundToKg(){
        System.out.println("Enter a number in pounds ");
        int lb = scan.nextInt();
        double kg = lb*0.45359237;
        return kg;
    }


}
