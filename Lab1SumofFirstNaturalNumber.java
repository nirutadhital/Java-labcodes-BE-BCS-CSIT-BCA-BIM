/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to display the sum of first n natural numbers.
*/
package javalabcodes;

import java.util.Scanner;
public class Lab1SumofFirstNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms:");
        int n=sc.nextInt();
        int i;
        int sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
        
    }
    
}
