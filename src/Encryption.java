import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;
public class Encryption {
	
	static int counter = 0;
	static int columCounter = 0;
	static String encrytpionString;
	
	public static void main(String[] args)
	{
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			encrytpionString = br.readLine();
		}
		catch(Exception e)
		{
			
			System.out.println(" "+e.getMessage());
		}
		
		String trimEncrytpionString = encrytpionString.replace(" ","");
		int rowsContraint = (int) Math.floor(Math.sqrt(trimEncrytpionString.length()));
		int columsConstraint = (int) Math.ceil(Math.sqrt(trimEncrytpionString.length()));
		
		int numberOfRows = rowsContraint;
		int numberOfColums = columsConstraint;
		
		
		while(numberOfRows*numberOfColums < trimEncrytpionString.length())
		{
			
			numberOfRows++;
			
		}
		
		
		for (int i=0;i<numberOfColums;i++)
		{
			columCounter = 0;
			
			while((i+columCounter) <= (trimEncrytpionString.length()-1))
			{
			
				System.out.print(trimEncrytpionString.charAt(i+columCounter));
				columCounter+=numberOfColums;	
			}
			
			System.out.print(" ");
			
			
		}
			
	}
}
	
	
