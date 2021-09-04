import java.util.Scanner;

class Fibo{
	public static void main(String [] arg)
	{
		int a = 0, b=1, c = 0;
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			c = a + b;
			a = b;
			b = c;
		}
		
		System.out.print(c);
	}
}
