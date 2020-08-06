package Java_Day4;

import java.util.Scanner;

public class Adddigits {
    public void add2numbers(){
        Scanner no=new Scanner(System.in);
        System.out.print("Enter the numbers for sum of digits: ");
        int number= no.nextInt();
        int sum = 0;
        while (number != 0)
            {
               sum = sum + number % 10;
               number = number/10;
            }
        System.out.println("The sum of digits is : "+sum);
        }
    public static void main(String[] args) {
        Adddigits Add2Numbersobj = new Adddigits();
        Add2Numbersobj.add2numbers();

    }
}
