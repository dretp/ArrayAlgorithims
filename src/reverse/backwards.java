package reverse;
import java.util.Scanner;
public class backwards {
	public static void main(String[] args) 
	{
		double[] values = readInputs(5);
		multiply(values,10);
		Reversed(values);
	}
	// Reads sequence of numbers and return an array containing the inputs values
	public static double[] readInputs(int number) 
	{
		System.out.println("Enter" + number + "Numbers:");
		Scanner in = new Scanner(System.in);
		double[] inputs = new double[number];
		for(int i = 0; i < inputs.length; i++) 
		{
			inputs[i] = in.nextDouble();
		}
		return inputs;
	}
	// Multiplies all elements of an array
		public static void multiply(double[] data, double factor) 
		{
			for(int i = 0; i< data.length; i++) 
			{
				data[i] = data[i] * factor;
			}
		}
		public static void Reversed(double[] data) 
		{
			for(int i = data.length - 1; i>= 0; i--) 
			{
				System.out.println(data[i] + "");
			}
		}
}
