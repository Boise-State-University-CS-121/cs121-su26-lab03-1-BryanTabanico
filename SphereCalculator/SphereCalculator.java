import java.util.Scanner;

public class SphereCalculator 
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        /*Get Inputs */
        System.out.print("Enter the sphere's radius: ");
        int radius = scnr.nextInt();
        
        /*Math Calculations */
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2.0);

        /*Outputs */
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface Area: %.4f\n", surfaceArea );


        scnr.close();

    }
    
}
