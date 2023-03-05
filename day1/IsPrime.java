package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 13;
		boolean nonprime = false;
		
		for (int i = 2; i <= (n/2); i++) {
			
			if(n%i==0)
			{
				nonprime = true;
		
			}
			
		
		}
			if (nonprime==false)
			{
				System.out.println("Given Number  " + n + " is Prime Number");
		}
			
			else
			{
				System.out.println("Given Number  " + n + " is Not Prime Number");
			}
			
		}

}
