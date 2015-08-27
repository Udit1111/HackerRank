import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BlackandWhite {
	
	static int rotationCounter = 0;
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		rotationCounter = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<rotationCounter;i++){
			
			String numberOfGifts = scan.nextLine();
			StringTokenizer ST1 = new StringTokenizer(numberOfGifts, " ");
			long numberOfBlackGifts = Long.parseLong(ST1.nextToken());
			long numberOfWhiteGifts = Long.parseLong(ST1.nextToken());
			
			String costOfGifts = scan.nextLine();
			StringTokenizer ST2 = new StringTokenizer(costOfGifts, " ");
			
			long blackPrice = Long.parseLong(ST2.nextToken());
			long whitePrice = Long.parseLong(ST2.nextToken());
			long interChangePrice = Long.parseLong(ST2.nextToken());

			System.out.println(calculateTotalPrice(numberOfBlackGifts,numberOfWhiteGifts, blackPrice, whitePrice, interChangePrice));
		}	
	}
	
	public static long calculateTotalPrice( long numberOfBlack, long numberOfWhite, long blackPrice, long whitePrice, long interChangePrice){
		return numberOfBlack * Math.min(blackPrice, whitePrice+interChangePrice) + numberOfWhite * Math.min(whitePrice, blackPrice+interChangePrice);
	}
}
