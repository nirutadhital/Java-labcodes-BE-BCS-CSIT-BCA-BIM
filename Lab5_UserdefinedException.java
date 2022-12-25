/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to craete user defined exception to check if the citizenship
has a legal age for wheeler liscence.
*/
package javalabcodes;

class Condition extends Exception
{
    Condition(String msg)
    {
        super(msg);
    }
}
public class Lab5_UserdefinedException {
    int a;
    public Lab5_UserdefinedException(int a)
    {
        this.a=a;
    }
    void check()
    {
        try
        {
            if(a>16 && a<60)
            {
                throw new Condition("you are eligible to drive");
            }
            System.out.println("you are not eligible to drive");
        }
        catch(Condition e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Lab5_UserdefinedException u=new Lab5_UserdefinedException(10);
        u.check();
        
    }
    
}
