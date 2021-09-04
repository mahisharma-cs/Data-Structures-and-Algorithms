//numCells

import java.util.Scanner;

class Cells
{
	public static void main(String arg[])
	{
		int size,key,temp;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		key = sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			temp = sc.nextInt();
			if(temp >= key)
			{
				System.out.print(i);
				break;
			}
		}
	}
}


//numCells
