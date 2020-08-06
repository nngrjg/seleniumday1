package Java_Day4;

import java.util.Scanner;

public class Biggestof3numbers {
    public void bigesstnumber() {
        System.out.println("Enter the numbers for finding bigesst value");
        Scanner no = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstnumber = no.nextInt();
        System.out.print("Enter the second number: ");
        int secondnumber = no.nextInt();
        System.out.print("Enter the Third number: ");
        int thirdnumber = no.nextInt();
        if (firstnumber < secondnumber) {
            if (secondnumber < thirdnumber) {
                System.out.println("The biggest number is: " + thirdnumber);
            } else {
                System.out.println("The biggest number is: " + secondnumber);
            }
        } else {
            System.out.println("The biggest number is: " + firstnumber);
        }
    }
    public void biggestnumberusingarray() {
            int value, max;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of inputs:");
            value = scan.nextInt();
            int array[] = new int[value];
            System.out.println("Enter the elements of array:");
            for(int i = 0; i < value; i++)
            {
               array[i] = scan.nextInt();
            }
            max = array[0];
            for(int i = 0; i < value; i++)
            {
                if(max < array[i])
                {
                    max = array[i];
                }
            }
           System.out.println("Biggest value is:"+max);
        }

    public static void main(String[] args) {
        Biggestof3numbers Biggestof3numbersobj = new Biggestof3numbers();
//        Biggestof3numbersobj.bigesstnumber();
        Biggestof3numbersobj.biggestnumberusingarray();
    }
}
