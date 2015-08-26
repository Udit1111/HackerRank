import java.io.*;
import java.util.Scanner;

public class BlackandWhite {
	
	static int rotationCounter = 0;
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		rotationCounter = Integer.parseInt(scan.nextLine());
		long[] results = calculateprice(9, 1, 1);
		System.out.println(results[0]+""+results[1]);}
	
	public static long[] calculateprice( long blackPrice, long whitePrice, long interchangePrice)
	{
		long[] returnValue = new long[2];
		if(blackPrice < interchangePrice && whitePrice < interchangePrice){
			returnValue[0] = blackPrice;
			returnValue[1] = whitePrice;}
		else if(blackPrice > interchangePrice && blackPrice > (interchangePrice + whitePrice)){
			returnValue[0] = interchangePrice + whitePrice;
			returnValue[1] = whitePrice;	
		}
		else if(whitePrice > interchangePrice && whitePrice > (interchangePrice + blackPrice)){
			returnValue[0] = blackPrice;
			returnValue[1] = interchangePrice + blackPrice;	
		}
		return returnValue;
	}
}
