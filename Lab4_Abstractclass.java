/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to show the use of abstract class
*/
package javalabcodes;

abstract class Fmachine
{
    abstract void getData(int code,String name,int capacity );
    abstract void putData();
}
class Airplane extends Fmachine
{
    int code;
    String name;
    int capacity;
    @Override
    public void getData(int code,String name,int capacity )
    {
        this.code=code;
        this.name=name;
        this.capacity=capacity;
    }
    @Override
    public void putData()
    {
        System.out.println(code+" "+name+" "+capacity);
    }
}
public class Lab4_Abstractclass {
    public static void main(String[] args) {
        Airplane a=new Airplane();
        a.getData(12,"red alert", 123);
        a.putData();
    }
    
}
