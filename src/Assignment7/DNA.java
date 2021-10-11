package Assignment7;

import java.util.Scanner;

public class DNA {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter any DNA strand");
       String DNAStrand = input.next();
       for(int i=0;i<DNAStrand.length();i++){
         if(DNAStrand.charAt(i)=='A')
             System.out.print("T");
         else if(DNAStrand.charAt(i)=='T')
             System.out.print("A");
         else if(DNAStrand.charAt(i)=='G')
             System.out.print("C");
         else if(DNAStrand.charAt(i)=='C')
             System.out.print("G");
       }

    }
}
