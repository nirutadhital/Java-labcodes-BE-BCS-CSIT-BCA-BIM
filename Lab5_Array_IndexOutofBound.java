/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
write a program in java to handle the exception when index greater than the size of the array.
*/
package javalabcodes;
public class Lab5_Array_IndexOutofBound {
    public static void main(String[] args) {
        int []a=new int[5];
        try
        {
            a[6]=100;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("the memory location is not available.");
        }
    }
    
}
