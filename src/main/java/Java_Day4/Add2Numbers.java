package Java_Day4;

import java.util.Scanner;

public class Add2Numbers {
    public void add2numbers(){
        System.out.println("Enter teh numbers for addition");
        Scanner no=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstnumber= no.nextInt();
        System.out.print("Enter the second number: ");
        int secondnumber= no.nextInt();
        int Totalsumvalue = firstnumber+secondnumber;
        System.out.println("The sum of "+firstnumber+" and "+secondnumber+" is : "+Totalsumvalue);
    }
    public static void main(String[] args) {
        Add2Numbers Add2Numbersobj = new Add2Numbers();
        Add2Numbersobj.add2numbers();

    }
}
