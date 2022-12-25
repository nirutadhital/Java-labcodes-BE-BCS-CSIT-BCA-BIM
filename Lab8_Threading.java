/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*write  aprogram in java to create two threads, one to print the alphabets and
another to print the number usig runnable interface*/
package javalabcodes;

class Alphabets implements Runnable
{
    @Override
    public void run()
    {
        int c='a';
        while(c<='z')
        {
            System.out.println((char)c);
            c=c+1;
        }
    }
}
class Numerals implements Runnable
{
    @Override
    public void run()
    {
       int i;
       for(i=1;i<=26;i++)
       {
           System.out.println(i);
       }
    }
}
  
public class Lab8_Threading {
    public static void main(String[] args) {
        Alphabets a=new Alphabets();
        Thread t1=new Thread(a);
        Numerals n=new Numerals();
        Thread t2=new Thread(n);
        t1.start();
        t2.start();
        
    }
    
}
