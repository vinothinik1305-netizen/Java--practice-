import java.util.*;
public class natural{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int input=sc.nextInt();
int sum=0;
for(int i=1;i<input;i++)
{
sum=sum+1;
}
System.out.println("sum of numbers:"+sum);
}
}
