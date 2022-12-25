/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to initialize object using parameterized constructor.
*/
package javalabcodes;
public class LAb2_PrameterizedConstructor {
    int length;
    int height;
    String color;
    LAb2_PrameterizedConstructor(int length,int height,String color)
    {
        this.length=length;
        this.height=height;
        this.color=color;
    }
    void display()
    {
        System.out.println("the attributes are:\n"+length+"\n"+height+"\n"+color);
    }
    
    public static void main(String[] args) {
       LAb2_PrameterizedConstructor p=new LAb2_PrameterizedConstructor(23, 12, "red");
       p.display();
        
    }
    
}
