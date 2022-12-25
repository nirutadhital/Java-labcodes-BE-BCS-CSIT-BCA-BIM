/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to ask the user for a sentence, if the length of 
the sentence is even then extract the character from second location otherwise
extract the characters from [2-4] location.
*/
package javalabcodes;

import java.util.Scanner;
public class Lab6_ExtractCharacter {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       char ch[]=new char[3];
        System.out.println("enter the sentence:");
        String sentence=sc.nextLine();
        int l=sentence.length();
        if(l%2==0)
        {
            System.out.println(sentence.charAt(2));
        }
        else
        {
            sentence.getChars(2, 5, ch, 0);
            System.out.println(ch);
        }
    }
    
}
