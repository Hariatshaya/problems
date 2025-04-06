import java.util.Scanner;
public class theatre {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of tickets:");
int tickets = sc.nextInt();
if(tickets<5 || tickets>40){
System.out.println("Minimum of 5 and Maximum of 40 Tickets");
return;
}
System.out.println("Do you want refreshment? y/n");
char refresh = sc.next().toLowerCase().charAt(0);
System.out.println("Do you have a coupon code? y/n");
char coupon = sc.next().toLowerCase().charAt(0);
System.out.println("Enter the circle");
char circle = sc.next().toLowerCase().charAt(0);

double price = 0;
if(circle=='k'){
price = 75;
}
else if(circle=='q'){
price = 150;
}
else{
System.out.println("Invalid input");
return;
}
double total = tickets*price;
if(tickets>20){
total-=total*0.10;
}
if(coupon=='y'){
total-=total*0.02;
}
if(refresh=='y'){
total+=tickets*50;
}
System.out.printf("Ticket cost:%.2f\n", total);
}
}