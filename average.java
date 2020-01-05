import java.util.Scanner;

class average
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[50];
		int n,i,sum=0,avg=0;
		
		System.out.println("\nEnter the Size of Array:");
		n=s.nextInt();
		
		System.out.println("\nEnter Elements of Array:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		
		avg=sum/n;
		System.out.println("\nElements of Array are :");
		
		for(i=0;i<n;i++)
		{
			System.out.println(+a[i]);
		}
		System.out.println("\nSum of Array    : "+sum);
		System.out.println("\nAverge of Array : "+avg);
	}  
};
