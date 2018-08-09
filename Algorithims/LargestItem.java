package reverse;
import java.util.Scanner;
import java.util.ArrayList;
public class LargestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> data = new ArrayList<Double>();
		// Read user Inputs
		System.out.println("Please Enter value, Press E to quit:");
		Scanner in = new Scanner(System.in);
		while(in.hasNextDouble()) 
		{
			data.add(in.nextDouble());
		}
		// Find the largest Value
		double largest = data.get(0);
		for(int i = 1; i < data.size(); i++) 
		{
			if(data.get(i) > largest) 
			{
				largest = data.get(i);
			}
		}
		// find the values and identify the largest
			for(double element : data) 
			{
				if(element == largest) {
				System.out.println( element +" <= largest value");
				}
			}
			System.out.println();
	}
	
	
	

}
