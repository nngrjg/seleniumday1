package Java_Day4;

import java.util.Scanner;

public class Stringcheck {

    public void checkthestring(){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the a character to check :");
        char characterentered=input.next().charAt(0);

         if(characterentered == 'a'|| characterentered == 'e'||
              characterentered == 'i' ||characterentered == 'o' ||characterentered == 'u'||
                 characterentered == 'A'|| characterentered == 'E'||
                 characterentered == 'I' ||characterentered == 'O' ||characterentered == 'U'){
         System.out.println("Entered character is vowel");
         }else{
         System.out.println("Entered character is consonant");
         }
   }
    public static void main(String[] args) {
        Stringcheck Stringcheckobj = new Stringcheck();
        Stringcheckobj.checkthestring();

    }
}
