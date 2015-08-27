import java.util.Scanner;
import java.util.StringTokenizer;

public class AngryProfessor {
	
	static int rotationCounter = 0;
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		rotationCounter = Integer.parseInt(scan.nextLine());
		for(int i=0; i<rotationCounter;i++){
			
			String constraints = scan.nextLine();
			String timeOfStudents = scan.nextLine();
			calculateClass(constraints, timeOfStudents);
			
		}
	}
	
	public static void calculateClass( String constraints , String timeOfStudents ){
		StringTokenizer ST1 = new StringTokenizer(constraints, " ");
		int numberOfStudents = Integer.parseInt(ST1.nextToken());
		int minimumOfStudents = Integer.parseInt(ST1.nextToken());
		StringTokenizer ST2 = new StringTokenizer(timeOfStudents, " ");
		int counter = 0;
		while(ST2.hasMoreTokens()){
			int timeOfStudent = Integer.parseInt(ST2.nextToken());
			
			if(timeOfStudent <= 0){
				counter++;
			}
		}
		
		if(counter >= minimumOfStudents){
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
	
}
