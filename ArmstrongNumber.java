package assignment.week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =153 , calculate=0, remainder, original;
		 original = input;
		while (original > 0)
        {
			remainder = original % 10;
			original = original/ 10;
			calculate = (int) (calculate + Math.pow(remainder, 3));
			
			
		}
		if (calculate == input) {
			System.out.println("It is a amstrong number");
		} else
			System.out.println("It is  not a amstrong number");
	}
}
