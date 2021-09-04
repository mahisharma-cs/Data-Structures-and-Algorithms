import java.util.Scanner;
import java.lang.StringBuilder;

class Nthnumber
{

	static int nth(int num)
	{
		return num%2 == 0 ? ((num-1)/2) : num-1;
	}

	public static void main(String [] arg)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		System.out.println(nth(num));
		
		String str = "hello";
		
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println("Reverse : "+());
	}
}
