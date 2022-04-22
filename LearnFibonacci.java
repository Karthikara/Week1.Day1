package week1.day1;

public class LearnFibonacci 
{

	public static void main(String[] args)
	{
		int i,num1 = 0, num2 = 1, sum;
		for (i=0; i<=8; i++)
		{
			System.out.print(num1 + " ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;

		}
	}

}
