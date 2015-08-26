import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.*;

import java.util.regex.*;

public class Kaprekar {
	
	static int lowerRange, upperRange;
	static String kaprekarArray,lowerRange1;
	static String finalKaprekarNumbers;
	static boolean countZero;
	public static void main(String[] args){
		try{
			Scanner inputReader = new Scanner (System.in);
			lowerRange = Integer.parseInt(inputReader.nextLine());
			upperRange = Integer.parseInt(inputReader.nextLine());
		}
		catch(Exception e){
			System.out.println(" "+e.getMessage());
		}
		
		for(long i=lowerRange; i<=upperRange; i++){
			String currentString = ""+i;
			String resultant = ""+i*i;
			List<Integer> Indcies = calcuateIndcies(currentString.length(), resultant.length());
			boolean flag = false;
			for(int counter = 0;counter< Indcies.size();counter++)
			{
					
					flag = calcuateKaprekarNumber(resultant,Indcies.get(counter),i);	
					if(flag){
						if(finalKaprekarNumbers == null)
						{finalKaprekarNumbers = currentString;}
						else
						{	if(!finalKaprekarNumbers.contains(currentString))
							finalKaprekarNumbers = finalKaprekarNumbers + " "+ currentString; }
					}
			}	
		}
		
		if(finalKaprekarNumbers == null){
			System.out.println("INVALID RANGE");
		}
		else{
		System.out.println(finalKaprekarNumbers);
		}
	}
	
	static List calcuateIndcies(int lengthOfKaprekar, int lengthOfKaprekarSquare)
	{
		List<Integer> Indcies = new ArrayList<Integer>();
		
		/*Indcies.add((lengthOfKaprekarSquare/lengthOfKaprekar));
		
		float checkDecimal = ((float)lengthOfKaprekarSquare/(float)lengthOfKaprekar);
		if( checkDecimal > 1.00){
		Indcies.add((int)Math.ceil(checkDecimal)+1);
		Indcies.add(((int)Math.ceil(checkDecimal)-1));
		} */
		
		Indcies.add(lengthOfKaprekar-1);
		if((lengthOfKaprekarSquare)-1 >= (lengthOfKaprekar-2))
		{Indcies.add(lengthOfKaprekar-2);}
		if((lengthOfKaprekarSquare)-1 >= (lengthOfKaprekar)){
		Indcies.add(lengthOfKaprekar);}
		return Indcies;	 
	}
	
	static boolean calcuateKaprekarNumber(String resultant, int index, long checkResult){		
		boolean result = false;
		int firstHalf =0;
		String firstHalf1 = "";
		try{firstHalf1 = resultant.substring(0,index);
			firstHalf = Integer.parseInt(firstHalf1);}
		catch(Exception e){
			firstHalf = 0;
		}
		int secondHalf=0;
		String secondHalf1 = "";
		try
		{ 	secondHalf1 = resultant.substring(index);
			secondHalf = Integer.parseInt((secondHalf1));
			String pattern = "[0]*";
			countZero = secondHalf1.matches(pattern);
		}
		catch(Exception e)
		{
			secondHalf =0;
			
		}
			
		if ((firstHalf + secondHalf) == checkResult && !countZero){
			if(firstHalf1.length() == secondHalf1.length() || (firstHalf1.length()-1) == secondHalf1.length() || (firstHalf1.length() == secondHalf1.length()-1))
			 result =true;
		}
		else{
			result = false;
		}return result;
	}
}
