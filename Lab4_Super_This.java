/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to show the use of super and this keyword
*/
package javalabcodes;
class Rectangle1
{
    int length;
    int breadth;
    void getData(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
        System.out.println("The area of Rectangle1 is:"+length*breadth);
    }
}
class Rectangle2 extends Rectangle1
{
    @Override
    void getData(int length,int breadth)
    {
        super.getData(5, 6);
        System.out.println("The area of Rectangle2 is:"+length*breadth);
    }
}
public class Lab4_Super_This {
    public static void main(String[] args) {
        Rectangle2 r=new Rectangle2();
        r.getData(2, 7);
        
        
    }
    
}
