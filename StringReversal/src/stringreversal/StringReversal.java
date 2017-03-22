/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreversal;

import java.util.ArrayList;

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
         String originalString="Testclass",reversedString="";
        //char[] tempOriginal=originalString.toCharArray();
        

        
       
   System.out.println(ReverseString(originalString));
    }
    
    
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
