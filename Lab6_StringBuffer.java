/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to input 5 first names, replace letter "a" with "?" using
string buffer.
*/
package javalabcodes;

import java.util.Scanner;
public class Lab6_StringBuffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[5];
        int i;
        System.out.println("enter 5 names:");
        for(i=0;i<5;i++)
        {
            name[i]=sc.next();
        }
        System.out.println("the result is:");
        for(i=0;i<5;i++)
        {
            System.out.print(name[i].replace("a", "?"));
        }
    }
    
}
