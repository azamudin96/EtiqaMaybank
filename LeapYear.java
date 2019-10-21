/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter year: ");
        int year = sc.nextInt();
        boolean leap = false;
        
        if ( year % 4 == 0 )
        {
            if (year % 100 == 0 )
            {
                if (year % 400 == 00 ) 
                    leap = true;
                else
                    leap = false;
            }
            else leap = true;
        }
        else leap = false;
        if (leap)
            System.out.println(year + " is a leap year. ");
        else
            System.out.println(year + " is not a leap year. ");
    }
}
