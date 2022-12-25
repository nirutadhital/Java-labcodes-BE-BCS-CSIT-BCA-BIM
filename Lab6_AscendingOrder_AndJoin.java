/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to input 5 surnames arrange them in ascending order and join 
all of them with *.
*/
package javalabcodes;

import java.util.Scanner;
public class Lab6_AscendingOrder_AndJoin {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("entert he name of 5 surnames:");
        String name[]=new String[5];
        int i,j;
        String temp="";
        for(i=0;i<5;i++)
        {
            name[i]=sc.next();
        }
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(name[i].compareTo(name[j])>0)
                {
                temp=name[i];
                name[i]=name[j];
                name[j]=temp;
                }
            }
        }
        System.out.println("Ascending order:");
        for(i=0;i<5;i++)
        {
            System.out.print(name[i]);
            System.out.print(name[i].join(" ","*"));
        }
       
    }
    
}
