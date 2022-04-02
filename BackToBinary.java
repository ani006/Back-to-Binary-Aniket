// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class BackToBinary {
    public static void main(String[] args) {
        int num1=1011;
        int num2=11111;
        
         num1=binaryToIntegerConversion(num1);
         num2=binaryToIntegerConversion(num2);
        List<Integer> result=getPrime(num1,num2);
        for(int i=0;i<result.size();i++)
        {
            System.out.println(result.get(i));
        }
    }
    
static List<Integer> getPrime(int num1,int num2)
{
    List<Integer> list=new ArrayList<>();
    for(int i=num1;i<=num2;i++)
    {
        int status=1;
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
            {
                status=0;
                break;
            }
        }
        if(status==1)
        {
            list.add(i);
        }
    }
    return list;
}
 static int binaryToIntegerConversion(int num)
 {
        int count=0,sum=0;
        while(num!=0)
        {   
            int temp=num%10;
            if(temp==1)
            {
                sum+=Math.pow(2,count);
            }
            num=num/10;
            count++;
        }
        return sum;
 }
}
