import java.util.Scanner;

public class Length {

    Scanner scan  = new Scanner(System.in);

    public int ConvertMToCM (){
        System.out.println("Enter a number in meters: ");
        int m = scan.nextInt();
        int cm = 100*m;
        return cm;
    }

    public double ConvertCMToM (){
        System.out.println("Enter a number in cm: ");
        int cm = scan.nextInt();
        double m = cm*0.01;
        return m;
    }




}
