//Ram and Mohan

/*
import java.util.Scanner;
import java.util.ArrayList;

class SumXY
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
	
		int num1 = sc.nextInt();		
		int num2 = sc.nextInt();
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
				
		int i=1;

		while(true)
		{
			i++;
			if(num2%i == 0)
			{
				num2 /= i;
				arr2.add(i);
			}
			if(num2 == 1) break;
		}
		
		i=1;
		
		while(true)
		{
			i++;
			if(num1%i == 0)
			{
				num1 /= i;
				arr1.add(i);
			}
			if(num1 == 1) break;
		}
		
		if(arr1.size() == 2)
		{
			System.out.print("1: "+arr1.get(0)+" "+arr2.get(1));
		}
		else if(arr2.size() == 2)
		{
			System.out.print("2: "+arr2.get(0)+" "+arr2.get(1));
		}
	}
}
*/


import java.util.*;

public class Main
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int num1=1;
    int num2=a- num1;
    if(num1+num2==a && num1*num2==b){
        System.out.print(num1);
        System.out.print(num2);
    }
    for( num1=2;num1<=a;num1++){
       num2=a-num1;
       if(num1+num2==a && num1*num2==b)break;
    }
    if(num2>num1){
        System.out.print(num1);
        System.out.print(' ');
        System.out.print(num2);
    }
    else{
        System.out.print(num2);
        System.out.print(' ');
        System.out.print(num1);
    }
  }
}

//Ram and Mohan
