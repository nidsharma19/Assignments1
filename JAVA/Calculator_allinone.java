import java.util.*;

public class Calculator_allinone {
	Calculator_allinone(int n, int p)
	{
	
	}
	
	public static void calculatorinp(int n, int p)throws Exception 
	{
        if(n==0 && p==0) 
	        {
	            throw new Exception("n and p should not be zero."); 
	        } 
        else if(n<0 || p<0) 
	        {
	            throw new Exception("n or p should not be negative.");
	        } 
        else 
	        {
				int c=1;
				for(int i=1;i<=p;i++)
					
				c=n*c;
			
				System.out.println("Your desired output is:"+c);
	        }
	}
	
	
	public static void main(String[] args) throws Exception 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no:");
		int n = sc.nextInt();
		System.out.println("Enter the second no :");
		int p = sc.nextInt();
		calculatorinp(n, p);	
	}
       
}
