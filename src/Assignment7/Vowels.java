package Assignment7;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args){
        int countaa=0,
            countee=0,
            countii=0,
            countoo=0,
            countuu=0;
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Enter any sentence to count the vowels");
            String sentence = input.nextLine();

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == 'a')
                    countaa++;
                if (sentence.charAt(i) == 'e')
                    countee++;
                if (sentence.charAt(i) == 'i')
                    countii++;
                if (sentence.charAt(i) == 'o')
                    countoo++;
                if (sentence.charAt(i) == 'u')
                    countuu++;

            }
            System.out.println("# of 'a' : " + countaa);
            System.out.println("# of 'e' : " + countee);
            System.out.println("# of 'i' : " + countii);
            System.out.println("# of 'o' : " + countoo);
            System.out.println("# of 'u' : " + countuu);
        }
    }
}
