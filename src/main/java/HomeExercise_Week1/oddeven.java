package HomeExercise_Week1;

import java.util.Scanner;

public class oddeven {
    public void oddeven(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputnumber= sc.nextInt();
        if (inputnumber % 2 == 0) {
            System.out.println("This is Even Number");
        }else{
            System.out.println("This is Odd Number");
        }
    }
    public static void main(String[] args) {
        oddeven oeobj = new oddeven();
        oeobj.oddeven();
    }
}
