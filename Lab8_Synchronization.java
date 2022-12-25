/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to implement synchronization method based on the scenario
of single bank account and two access from different person.
*/

package javalabcodes;

class Bank implements Runnable
{
    int total_balance=2000;
    public void withdraw(String name,int withdraw_balance)
    {
        synchronized(this)
        {
            if(withdraw_balance<total_balance)
            {
                System.out.println(name+" withdrawn: "+withdraw_balance);
                total_balance=total_balance-withdraw_balance;
                System.out.println("remaining balance is: "+total_balance);
            }
            else
            {
                System.out.println(name+" cannot withdrawn "+withdraw_balance+" due to insufficient balance "+total_balance);
            }
        }
    }
    @Override
    public void run()
    {
        String n=Thread.currentThread().getName();
        if(n.equals("James"))
        {
            withdraw(n,1500);
        }
        else if(n.equals("Tom"))
        {
            withdraw(n,700);
        }
    }
}
public class Lab8_Synchronization {
    public static void main(String[] args) {
        Bank b=new Bank();
        Thread t1=new Thread(b);
        t1.setName("James");
        Thread t2=new Thread(b);
        t2.setName("Tom");
        t1.start();
        t2.start();
        
    }
    
}
