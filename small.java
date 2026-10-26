import java.util.*;
public class small{
public static void main(String []args)
{
int mark[]={8,98,17,91,15,2,1};
int small =mark[0];
for(int i=1;i<mark.length;i++)
{if(mark[i]<small)
{
small=mark[i];
}
}
System.out.println("smallest number is " +small);
}
}
