package reverse;
import java.util.Scanner;
import java.util.Arrays;
public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double[] scores = read();
			if(scores.length == 0) 
			{
				System.out.println("Please enter at least one score");
			}
			else 
			{
				double total = sum(scores) - minimum(scores);
				System.out.println("final score is: " + total);
			}
	}
	public static double[] read() 
	{
		int size = 10;
		double[] inputs = new double[size];
		 System.out.println(" Please enter values, press E to quit:");
		 Scanner in = new Scanner(System.in);
		 //
		 int currentSize = 0;
		 while(in.hasNextDouble()) 
		 {
			 //grow the array until it's filled
			 if(currentSize >= inputs.length) 
			 {
				 inputs = Arrays.copyOf(inputs,2 * inputs.length);
			 }
			 inputs[currentSize] = in.nextDouble();
			 currentSize++;
		 }
		 return Arrays.copyOf(inputs, currentSize);
	}
	// compute the sum values of the array
	 public static double sum(double[] data) 
	 {
		 double total = 0;
		 for(double element:data) 
		 {
			 total = total + element;
		 }
		 return total;
	 }
	 // Gets the minimum value of an Array
	 public static double minimum(double[] data) 
	 {
		 double smallest = data[0];
		 for(int i = 0; i < data.length; i++) 
		 {
			 if(data[i] <= smallest) 
			 {
				 smallest = data[i];
			 }
		 }
		 return smallest;
	 }
}
