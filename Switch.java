import java.util.*;
public class Switch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        int flag=0;
        if(age>=18)
        flag=1;
        switch(flag)
        {
            case 0:
                {
                System.out.println("Not Eligible");
                break;
                }
        
            case 1:
            {
                System.out.println("Eligible");
                break;
            }
        }

    }
}