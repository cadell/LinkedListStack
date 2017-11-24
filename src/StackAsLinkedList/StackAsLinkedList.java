/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAsLinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author cadelmonterde
 */
public class StackAsLinkedList 
{

    /**
     * @param args the command line arguments
     */
    LinkedListStack stack = new LinkedListStack();
    public static void main(String[] args)
    {
        StackAsLinkedList fun = new StackAsLinkedList();
        fun.readFileLoadStack();
      //  fun.popStackPrintMsg();
      
        
    }
    public void readFileLoadStack()
    {
        File file = new File("thing.txt");
        try
        {
            Scanner readFile = new Scanner(file);
            while(readFile.hasNext())
            {
                String word = readFile.nextLine();
                String[] hold = word.split(" ");
                for(int i =0; i < hold.length; i++)
                {
                   // System.out.println(hold[i]);
                    stack.push((Object)hold[i]);
                }
                popStackPrintMsg();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found bruh...");
        }
        
        
    }
    
    public void popStackPrintMsg()
    {
        String song = "";
        while(!stack.empty())
        {
            song +=stack.pop() +" ";
        }
        System.out.println(song);
        song = new String();
    }
}
