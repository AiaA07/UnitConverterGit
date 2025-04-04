//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Pick a conversion measurement: ");
        System.out.println("1. Length");
        System.out.println("2. Weight");
        System.out.println("3. Temperature");

        int choice = scan.nextInt();

        switch(choice){
            case 1:
                Length L = new Length();
                System.out.println("Centimeters: " + L.ConvertMToCM());
                System.out.println("Meters: " + L.ConvertCMToM());;
                break;
            case 2:
                Weight W = new Weight();
                System.out.println("Kilograms: " + W.ConvertPoundToKg());
                System.out.println("Pounds: " + W.ConvertKgToPound());
                break;
            case 3:
                Temperature T = new Temperature();
                System.out.println("Kelvin: " + T.ConvertFToK());
                System.out.print("Fahrenheit: " + T.ConvertKToF());
                break;
            default:
                System.out.println("Invalid choice.");

        }

        }
    }