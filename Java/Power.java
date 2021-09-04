//power little brother

import java.util.Scanner;

class Power
{

    public static void main(String [] arg)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int ans_sum = 0,temp = num;
        boolean isPower2 = true;
        
        while(num!=0)
        {
            if(num == 1) break;
            else if(num%2 == 0)
            {
                num /= 2;
            }
            else if(num%2 != 0)
            {
                isPower2 = false;
                break;
            }
        }
        
        while(temp != 0)
        {
            ans_sum += temp%10;
            temp/=10;
        }
        
        if(isPower2)
        {
            System.out.println("Yes");
            System.out.print(ans_sum);
        }
        else
        {
            System.out.println("No");
        }
    }
}

//power little brother
