/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddnumber;

import java.util.*;

public class Oddnumber {
    public static void main(String[] args) {
        
    int [] arr = {-3,5,6,2,7,1,0,8};
    int largestOdd, firstOdd = 1;
    for (int i = 0; i < arr.length; i++)
       if(arr [i]%2 != 0)
        {
            firstOdd = arr [i];
            break;
        }
    largestOdd = firstOdd;
    for (int j = 0; j < arr.length; j++)
        if (arr [j]%2 != 0 && arr [j]>largestOdd)
           largestOdd = arr [j];
    
       System.out.println ("The largest odd number is: "+largestOdd);
  }
    
}
