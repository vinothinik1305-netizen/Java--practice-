import java.util.*;
public class diff{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int input=sc.nextInt();
int evensum=0;
int oddsum=0;
for(int i=0;i<=input;i++)
{
if(i%2==0)
{
evensum = evensum+i;
}else {
oddsum=oddsum+i;
}
}
System.out.println("sum of even numers:" +evensum);
System.out.println("sum of odd numbers:" +oddsum);
sc.close();
}}
