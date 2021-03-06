package com.bridgelabz.program;

/******************************************************************************  
 *  Purpose: Find the imaginary number using binary serach
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   03-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class QuestionNumber
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter any number: ");
		int lNumber = utility.inputInteger();
		int lRange = (int) Math.pow(2, lNumber-1);
		int lResult=Utility.findQuestionNumber1(0,lRange);
		if(lResult != -1)
		{
			System.out.println("Your number is: " +lNumber);
		}
		else
		{
			System.out.println("Invalid Number");
		}
	}
	}
