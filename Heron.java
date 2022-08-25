
public class Heron {
	
	public  void heron(double square, double guess) {
		
		double x = square/guess;
		
		double y = (guess + x)/2;
		
	
	
		
	if (y * y >= (square - 0.001) && y * y <= (square + 0.001)) {
			
			System.out.println("Root of " + square + " is approximately " + y);
			
		}
		
		else {
			
			heron(square, y);
			
		}
	}
}
