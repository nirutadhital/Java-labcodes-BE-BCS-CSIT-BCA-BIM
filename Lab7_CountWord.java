/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//write a program to count the word "this" in the text file.
package javalabcodes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab7_CountWord {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String ch;
        int count=0;
        String n[]=null;
        FileReader reader=new FileReader("BCA.txt");
        BufferedReader bf=new BufferedReader(reader);
        while((ch=bf.readLine())!=null)
        {
            n=ch.split(" ");
        }
        for(String n1:n)
        {
            if(n1.equals("this"))
            {
                count++;
            }
        }
        System.out.println("the total count is:"+count);
        bf.close();
    }
    
}
