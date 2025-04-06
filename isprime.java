import java.util.Scanner;
public class isprime {
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if(a<=0){
System.out.println("please enter a positive integer!!!!");
return;
}

  if(a==1){
System.out.println(a + " is not a prime number");
return;
}
boolean prime = true;
for(int i=2;i<=a;i++){
if(a%i==0){
prime = false;
break;
}
}
if(!prime){
System.out.println(a + " is not a prime number");
}
else{
System.out.println(a + " is a prime number");
}
}
}