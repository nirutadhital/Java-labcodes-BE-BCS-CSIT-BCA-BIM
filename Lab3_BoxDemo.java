/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to create a class Box withattributes length and breadth.
Add a constructor to initialize the object, a method getLength() to return the length,
a method getBreadth()to return breadth and a method area() to find the area of the box .
create a main class named BoxDemo to create two objects and display the largest area.
*/
package javalabcodes;
class Box
{
    int length,breadth;
    Box(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    int getLength()
    {
        return length;
    }
    int getBreadth()
    {
        return breadth;
    }
    int Area()
    {
        return getLength()*getBreadth();
    }
}
public class Lab3_BoxDemo {
    public static void main(String[] args) {
        Box b1=new Box(12, 13);
        Box b2=new Box(10, 20);

           if(b1.Area()>b2.Area())
           {
               System.out.println(b1.Area());
           }
           else if(b1.Area()==b2.Area())
           {
               System.out.println(b1.Area());
           }
             else
           {
               System.out.println(b2.Area());
           }
          
        
    }
    
}
