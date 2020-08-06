package Java_Day4;

import java.util.Scanner;

public class Multipy2Float {
    public void Floatmultiply(){
        System.out.println("Enter the Float numbers for Multiplication");
        Scanner no=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        Float firstnumber= no.nextFloat();
        System.out.print("Enter the second number: ");
        Float secondnumber= no.nextFloat();
        Float Totalsumvalue = firstnumber*secondnumber;
        System.out.println("The sum of "+firstnumber+" and "+secondnumber+" is : "+Totalsumvalue);
    }

    public static void main(String[] args) {
        Multipy2Float Multipy2Floatobj = new Multipy2Float();
        Multipy2Floatobj.Floatmultiply();
    }
}
