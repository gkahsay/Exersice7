package Assignment7;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args){
         isUpperCase('A');
    }
    public static boolean isUpperCase(char upperLetter){
        int count=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String sentence = input.nextLine();
        for(int i=0;i<sentence.length();i++){
           //upperLetter =sentence.charAt(i) ;
           if(sentence.charAt(i)>='A' && sentence.charAt(i)<='Z')
               count++;
        }
              System.out.println("'"+ upperLetter +"'");


       System.out.println(count);
        return true;

    }
}
