import java.util.Scanner;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		
		Heron one = new Heron();
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Select a number to find the root of");
		double sq = scan.nextFloat();
		
		System.out.println("Select root approximation");
		double gess = scan.nextFloat();
		
			long start1 = System.nanoTime();

				one.heron(sq, gess);
		
			long end1 = System.nanoTime();
		
			long duration1 = (end1 - start1);
		
			System.out.println(duration1);
		
		
		
		
		
		
		
		System.out.println("Select a second number to find the root of");
		double sq2 = scan.nextFloat();
		
			long start2 = System.nanoTime();
		
				System.out.println(Math.sqrt(sq2));
	
			long end2 = System.nanoTime();
		
			long duration2 = (end2 - start2);
		
			System.out.println(duration2);

	}
		
	
		

		
	
		
		
		
	}
	



