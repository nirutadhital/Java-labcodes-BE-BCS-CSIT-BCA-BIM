/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to print first n prime numbers
*/
package javalabcodes;

import java.util.Scanner;
public class Lab1_First_n_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms:");
        int n=sc.nextInt();
        boolean flag;
        int i,j;
        int initial=2;
        for(i=1;i<=n;)
        {
            flag=true;
            for(j=2;j<=initial/2;j++)
            {
                if(initial%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(initial);
                i++;
            }
            initial++;
        }
        
    }
    
}
