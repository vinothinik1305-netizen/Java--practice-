import java.util.*;
public class Calculator {
int a, b;
Calculator(int x, int y) {
a = x;
b=y;        
}
void addition() {
System.out.println("Addition = " + (a + b));
}
void subtraction() {
System.out.println("Subtraction = " + (a - b));
}
void multiplication() {
System.out.println("Multiplication = " + (a * b));
}
void division() {
if (b != 0) {
System.out.println("Division = " + ((double) a / b));
} else {
System.out.println("Division by zero is not possible");
}
}
public static void main(String[] args) {
Calculator c1 = new Calculator(20, 10);
c1.addition();
c1.subtraction();
c1.multiplication();
c1.division();
}
}
