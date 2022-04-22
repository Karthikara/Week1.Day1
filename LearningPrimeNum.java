package week1.day1;

public class LearningPrimeNum {

	public static void main(String[] args) {
		int i,num=53;
		boolean flag=false;
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
			if(!flag)
				System.out.println("the given num is " + num +" is a prime number");
			else
				System.out.println("the given num is " + num +" is not a prime number");
		}
	}

