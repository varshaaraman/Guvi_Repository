/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreversal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author varshaa
 */
public class StringReversal {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String originalString="",reversedString="";
        //char[] tempOriginal=originalString.toCharArray();
        Scanner input=new Scanner(System.in);
        originalString=input.next();
        

        
       
   System.out.println(ReverseString(originalString));
    }
    
  /**
   * 
   * @param InputString the string to be reversed
   * @return the reversed string
   */  
public static String  ReverseString(String InputString) { 
    ArrayList<Character> tempList = new ArrayList<>();
    StringBuilder builderString = new StringBuilder();
    for(int i=InputString.length()-1;i>=0;i--)
        {
            tempList.add(InputString.charAt(i));
         builderString = new StringBuilder(tempList.size());
             for(Character tempChar:tempList)
    {
        builderString.append(tempChar);
    }

         
          
        }
   
  return builderString.toString();
}
    
}
