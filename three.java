import java.util.*;
public class three{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int input=sc.nextInt();
int sum=0;
for(int i=1;i<input;i++)
{
if(i%3==0)
{
sum=sum+i;
}else{
System.out.println("invalid number");
}
}
System.out.println("sum of num:" +sum);
sc.close();
}
}
