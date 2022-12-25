/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to handle the exception when trying to divide by zero
*/
package javalabcodes;
public class Lab5_Arithmetic_Exception {
    public static void main(String[] args) {
        int a=3;
        try
        {
            a=a/0;
        }
        finally
        {
            System.out.println("you are trying to divide by zero");
        }
    }
    
}
