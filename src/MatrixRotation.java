import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatrixRotation {
	
	static int temp1;
	static int numberOfRows, numberOfColums,numberOfRotations;
	static BufferedReader br;
	static StringTokenizer ST2;
	
	public static void main(String[] args)
	{
		
		try{
			
			br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer ST1 = new StringTokenizer(br.readLine()," ");
			
			numberOfRows = Integer.parseInt(ST1.nextToken());
			numberOfColums = Integer.parseInt(ST1.nextToken());
			numberOfRotations = Integer.parseInt(ST1.nextToken());
		}
		
		catch(Exception e)
		{
			
			System.out.println(" "+e.getMessage()); 
		}
		
		 int[][] martix= new int[numberOfRows][numberOfColums];
		 
		 for (int i=0; i<numberOfRows;i++)
		 {
			 try
			 {
			  
			 ST2 = new StringTokenizer(br.readLine(), " ");
			 }
			 
			 catch(Exception e)
			 {
				 System.out.println(e.getMessage());
			 }
			 
			 for (int j=0; j<numberOfColums;j++)
			 {	 	
			 martix[i][j] = Integer.parseInt(ST2.nextToken());	
		 
			 }
			 
		 } 
		 
		 rotateMatrix(martix);
		
		
		
		 
		 
	}
	
	static void rotateMatrix(int martix[][])
	{
		int martix1[][] = martix;
		
		for(int rotation=1;rotation<=numberOfRotations;rotation++)
	{
		for(int i=0,j=0;i<=1&&j<=1;i++,j++)	
		{
		 rotateDown(martix1,i,j);
		// System.out.println(temp1);
		 rotateRight(martix1,i,j);
		 //System.out.println(temp1);
		 rotateUp(martix1,i,j);
		 //System.out.println(temp1);
		 rotateLeft(martix1,i,j);	
		 //System.out.println(temp1);
		}
	}
		 for (int i=0; i<numberOfRows;i++)
		 {
			 for (int j=0; j<numberOfColums;j++)
			 {
				 if(j==0)
				 {
				 System.out.print(""+martix[i][j]);
				 }
				 else
				 {
					 System.out.print(" "+martix[i][j]);
				 }
			 }
			 
			 System.out.println();
		 } 
		 	
	}
	
	static int determineNumberofRotations(int numberOfRows, int numberOfColums)
	 {
		
		return (Math.min(numberOfRows,numberOfColums)/2);
		
		
		
	 }
	 
	static void rotateDown(int martix[][], int m, int n)
	{
		int temp2;
		temp1 = martix[m][n];
		
		for(int i=m;i<(numberOfRows-1)-m;i++)
		{
			temp2 = martix[(i+1)%4][n];
			martix[(i+1)%4][n] = temp1;
			temp1 = temp2;
		}
			
	}
	
	static void rotateRight(int martix[][], int m, int n)
	{
		
		int temp2;
		
		for(int i=n;i<(numberOfColums-1)-n;i++)
		{
			temp2 = martix[(numberOfRows-1)-m][(i+1)%4];
			martix[(numberOfRows-1)-m][(i+1)%4] = temp1;
			temp1 = temp2;
		}
				
	}
	
	static void rotateUp(int martix[][], int m, int n)
	{
		int temp2;
	
	for(int i=(numberOfRows-1)-m;i>m;i--)
	{
		temp2 = martix[(i-1)%4][(numberOfColums-1)-n];
		martix[(i-1)%4][(numberOfColums-1)-n] = temp1;
		temp1 = temp2;
	}		
}
	
	static void rotateLeft(int martix[][], int m, int n)
	{
		int temp2;	
		for(int i=(numberOfColums-1)-n;i>n;i--)
		{
			temp2 = martix[m][(i-1)%4];
			martix[m][(i-1)%4] = temp1;
			temp1 = temp2;
		}
		
	}

}
