/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to show the use of multiple inheritance
*/
package javalabcodes;

interface Result1
{
    void add(int x,int y);
    void showadd();
}
interface Result2
{
   void mul(int x,int y);
   void showmul();
}
class Result3 implements Result1,Result2
{
    int x,y;
    @Override
    public void add(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public void showadd()
    {
        System.out.println(x+y);
    }
    @Override
    public void mul(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public void showmul()
    {
        System.out.println(x*y);
    }
}
public class Lab4_MultipleInheritance {
    public static void main(String[] args) {
        Result3 r=new Result3();
        r.add(4, 3);
        r.showadd();
        r.mul(5, 6);
        r.showmul();
    }
    
}
