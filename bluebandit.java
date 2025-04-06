import java.util.Scanner;
public class bluebandit {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the first number: ");
int a = sc.nextInt();
System.out.println("enter the second number: ");
int b = sc.nextInt();
if(a>b || a<=0 || b<=0){
System.out.println("provide valid input!!");
return;
}
for(int i=a;i<=b;i++){
int j = 2;
boolean isprime = true;
while(j<=i/2){
if(i%j==0){ 
isprime = false;
break;
}
j++;
}
if (isprime && i > 1) {
System.out.print(i + " ");
}
}
}
}       