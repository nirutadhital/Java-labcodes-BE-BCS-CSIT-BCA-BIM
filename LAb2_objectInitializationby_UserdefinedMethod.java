/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to initialize object using user-defined method
*/
package javalabcodes;
public class LAb2_objectInitializationby_UserdefinedMethod {
    int length;
    int breadth;
    String color;
            void getData(int length,int breadth,String color)
            {
                this.length=length;
                this.breadth=breadth;
                this.color=color;
            }
            void display()
            {
                System.out.println("the attributes are:\n"+length+"\n"+breadth+"\n"+color);
            }
    public static void main(String[] args) {
        LAb2_objectInitializationby_UserdefinedMethod u=new LAb2_objectInitializationby_UserdefinedMethod();
        u.getData(12, 34, "red");
        u.display();
        
    }
    
}
