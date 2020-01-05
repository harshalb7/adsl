import java.util.Scanner;

class heap
{
	public static int a[]=new int[50];
	public static int c[]=new int[50];
	
	public static int n,i;
	public static void read()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter the Size of Array:");
		n=s.nextInt();
		System.out.println("\nEnter Elements of Array:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}	
	}//end of read
	/*heap()
	 {
	 	n=10;
	 	int b[] = new int[] {129,30,80,60,10,5,122,92,69,55};
	 	//a[10]={188,181,88,67,115,1,100,100,5,81};
	 	for(i=0;i<n;i++)
	 		a[i]=b[i];		
	 }*/
	public static void initilize()
	 {
	 	n=10;
	 	int b[]=new int[] {129,30,80,60,10,5,122,92,69,55};
	 	//a[10]={188,181,88,67,115,1,100,100,5,81};
	 	for(i=0;i<n;i++)
	 	{
	 		a[i]=b[i];	
	 		c[i]=b[i];
		}	 
	 }
	 public static void display()
	 {
	 	System.out.println("\nElements of Array are :");
		
		for(i=0;i<n;i++)
		{
			System.out.print("  "+a[i]);
		}
		System.out.println();
	 }//end of display
	public static void heapsort()
	 {
	 	for(i=(n-1)/2;i>=0;i--)
	 	{
	 		reheapdown(i,n);
	 	}
	 	int n1=n;
	 	n1--;
	 	
	 	while(n1>1)
	 	{
	 		int t=a[n1];
	 		a[n1]=a[0];
	 		a[0]=t;
	 		reheapdown(0,n1);
	 		n1--;
	 		display();
	 	}
	 	
	 }//end of heapsort
	 
	public static void reheapdown(int m,int n)
	 {
	 	int l;
	 	int r;
	 	
	 	while((2*m+1)<n)
	 	{
	 		l=2*m+1;
	 		r=2*m+2;
	 			
	 		if(a[l]>a[r]&&l<n)
	 		{
	 			
	 			if(a[m]<=a[l])
	 			{
	 				int t=a[m];
	 				a[m]=a[l];
	 				a[l]=t;
	 			}
	 			else 
	 				break;
	 		}
	 		else if (a[l]<=a[r]&&r<n)
	 		{
	 			l=r;
	 			if(a[m]<=a[l])
	 			{
	 				int t=a[m];
	 				a[m]=a[l];
	 				a[l]=t;
	 			}
	 			else 
	 				break;
	 		}
	 		else 
	 			break;		
	 		m=l;
	 	}
	 } //end of reheapdown
	public static void shellshort()
	 {
		int swapped=0;
		int gap=n/2;
		do
		{	
			do
			{
				swapped=0;
				for(i=0;i<n-gap;i++)
				{
					if(c[i]>c[i+gap])
					{
						int temp=c[i];
						c[i]=c[i+gap];
						c[i+gap]=temp;
						swapped=1;
					}
				}
			}while(swapped==1);
		}while((gap=(gap/2))>=1);

		for(i=0;i<n;i++)
		{
			System.out.print("  "+c[i]);
		}
		System.out.println();		
	 }
	public static void main(String args[])
	{
		int ch;
		Scanner c=new Scanner(System.in);
		initilize();
		do{
			System.out.println("1.Heap Sort ");
			System.out.println("2.Shell Sort");
			System.out.println("2.Exit      ");
			System.out.print("Choice:");
			ch=c.nextInt();

			switch(ch)
			{
				case 1:
					System.out.println("Heap Sort :");
					heapsort();
					display();
					break;
				case 2:
					System.out.println("Shell Sort :");
					shellshort();
					break;
				case 3:
					System.out.println("\nEXIT ");
					break;
			}
		}while(ch<3);
	}  
};
