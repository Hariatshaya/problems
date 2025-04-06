import java.util.Scanner;
public class seasons {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter a month: ");
int a = sc.nextInt();
if(a>=1 && a<=12){
if(a>=3 && a<=5){
System.out.println("season:spring");
}
else if(a>=6 && a<=8){
System.out.println("season:summer");
}
else if(a>=9 && a<=11){
System.out.println("season:autumn");
}
else{
System.out.println("season:winter");
}
}
else{
System.out.println("INVALID MONTH");
}
}
}