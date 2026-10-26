import java.util.*;
public class large{
public static void main(String []args)
{
int mark[]={7,8,98,17,91,15};
int large =mark[0];
for(int i=1;i<mark.length;i++)
{if(mark[i]>large)
{
large=mark[i];
}
}
System.out.println("largest number is " +large);
}
}
