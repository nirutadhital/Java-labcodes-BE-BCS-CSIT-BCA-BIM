/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to initialize object using reference variable
*/
package javalabcodes;
public class Lab2_Object_Initialization_By_Reference_Variable {
    int length;
    int height;
    String color;
    void display()
    {
        System.out.println("the attributes are:\n"+length+"\n"+height+"\n"+color);
    }
    public static void main(String[] args) {
        Lab2_Object_Initialization_By_Reference_Variable r=new Lab2_Object_Initialization_By_Reference_Variable();
        r.length=3;
        r.height=5;
        r.color="white";
        r.display();
    
    }
    
}
