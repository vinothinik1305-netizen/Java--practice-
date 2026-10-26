import java.util.*;
public class second{
public static void main(String []args)
{
int mark[]={7,8,98,17,91,15};
int large =Integer.MIN_VALUE;
int second=Integer.MIN_VALUE;
for(int i=0;i<mark.length;i++)
{if(mark[i]>large)
{
second=large;
large=mark[i];
}else if(mark[i]>second&&mark[i]!=large){
second=mark[i];
}
}
System.out.println("second largest number is " +second);
}
}


