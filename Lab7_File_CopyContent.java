/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
write a program in java to copy the content of one file to another
*/
package javalabcodes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Lab7_File_CopyContent {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader reader=new FileReader("xyz.txt");
        FileWriter writer=new FileWriter("pqr.txt");
        int ch;
        try{
            while((ch=reader.read())!=0)
            {
                writer.write((char)ch);
            }
        }
        catch(IOException ex)
        {
            System.out.println("IO Exception Occurs");
        }
        finally
        {
            writer.flush();
            reader.close();
            writer.close();
            
        }
    }
    
}
