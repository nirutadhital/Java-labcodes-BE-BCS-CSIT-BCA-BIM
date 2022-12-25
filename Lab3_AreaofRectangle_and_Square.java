/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to create a class Shape with two methods named area()
to implement the concept of method overloading. one method to find the area of 
rectangle and another to find the area of the square.create a main class ShapeDemo 
to create the object and call the method.
*/
//here I use Lab3_AreaofRectangle_and_Square main method ,but you should have to use 
//ShapeDemo as main class according to question.
package javalabcodes;

class Shape
{
    void Area(int length,int breadth)
    {
        System.out.println("the area of rectabgle is:"+length*breadth);
    }
    void Area(int length)
    {
        System.out.println("the area of rectabgle is:"+length*length);
    }
}
public class Lab3_AreaofRectangle_and_Square {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.Area(5,6);
        s.Area(5);
        
    }
    
}
