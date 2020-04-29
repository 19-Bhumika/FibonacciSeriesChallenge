import java.util.*;
public class Fibonacci
{
	static int a=0,b=1,c=0;
	public static void fibo1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value:");
		int n=sc.nextInt();
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Fibonacci Series till "+n+" without using recursion is as follows:");
		System.out.print(a+" "+b);
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	public static void fibo2(int n)
	{
		if(n>0)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			fibo2(n-1);
		}
	}
	public static void main(String args[])
	{
		System.out.println();
		Scanner sc=new Scanner(System.in);
		boolean ch=true;
		while(ch)
		{
			System.out.print("1.Fibonacci Series without using recursion\n2.Fibonacci Series using recursion\n3.Exit");
			System.out.print("\nChoose your option:");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					fibo1();
					break;
				}
				case 2:
				{
					Scanner s=new Scanner(System.in);
					System.out.print("Enter a value:");
					int no=s.nextInt();
					System.out.println("--------------------------------------------------------------------");
					System.out.println("Fibonacci Series till "+no+" using recursion is as follows:");
					System.out.print(a+" "+b);
					fibo2(no);
					break;
				}
				case 3:
				{
					System.exit(0);
				}
				default:
				{
					System.out.println("Invalid choice!");
					break;
				}
			}
			System.out.print("\nWant to continue?(true or false):");
			ch=new Scanner(System.in).nextBoolean();
			a=0;
			b=1;
			c=0;
		}
	}
}







