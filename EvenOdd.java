/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/************************************************************************
* Programmer: Diana Cardona
*
* Course: CSCI 1471
*
* Date: January 31, 2024
*
* Assignment: Program #1: EvenOdd
*
* Environment: Java with Netbeans IDE
*
* Files Included: EvenOdd
*
* Purpose: Determine whether an integer is even/odd
*
* Input: Positive number
*
* Preconditions/Assumptions: Integer is a whole number, No decimals
*
* Output: Correct even/odd positive integer
*
* Algorithm:
* Input positive integer
* Determine whether integer is even/odd
* Correct output
***********************************************************************/

package evenodd;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create a new object
        Scanner input = new Scanner( System.in );
        
        //Prompt user for integer
        System.out.print("Enter a positive integer: ");
        System.out.print("\n"); //Integer on newline
        
        
        System.out.print("\n"); //Spaced out newline
        
        //Assign user input to variable integer
        int integer = input.nextInt();
        
        
        //Even number
        if ( integer % 2 == 0 && integer > 0 ) //"&&" contraint to positve numbers
            System.out.printf("\n%s %d %s\n", "The number", integer, "is even." );
        
        //Odd number
        else if ( integer != 0 && integer > 0 ) //"&&" contraint to positve numbers
            System.out.printf("\n%s %d %s\n", "The number", integer, "is odd." );
        
        else
            System.out.printf("\nNumber must be positive. Try again!\n");
    }
    
}
