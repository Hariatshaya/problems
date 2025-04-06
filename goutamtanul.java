import java.util.Scanner;
public class goutamtanul {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int temp = n;
int rev = 0;
if(n<0){
System.out.println("Invalid input!!");
return;
}
while(temp>0){
int rem = temp%10;
rev = (rev*10)+rem;
temp = temp/10;
}
if(n==rev){
System.out.println("Palindrome");
}
else{
System.out.println("Not palindrome");
}
}
}