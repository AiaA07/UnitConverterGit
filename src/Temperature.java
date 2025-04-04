import java.util.Scanner;

public class Temperature {

    Scanner scan = new Scanner(System.in);

    public double ConvertFToK(){
        System.out.println("Enter a number in Fahrenheit: ");
        int f = scan.nextInt();
        double k = ((f-32)/(1.799)) + 273.15;
        return k;
    }

    public double ConvertKToF(){
        System.out.println("Enter a number in Kelvin: ");
        int k = scan.nextInt();
        double f = 1.8*(k-273)+32;
        return f;
    }

}
