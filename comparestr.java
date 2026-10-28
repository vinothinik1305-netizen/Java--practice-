import java.util.*;
public class word{
public static void main(String []args){
String s1="hello";
String s2="hello";
String s3=new String("hello");
String s4=new String("world");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s1==s2);
System.out.println(s1.equals(s3));
System.out.println(s2.equals(s4));
}
}