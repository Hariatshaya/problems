import java.util.Scanner;
public class placement {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the no of students placed in CSE: ");
int cse = sc.nextInt();
System.out.println("enter the no of students placed in ECE: ");
int ece = sc.nextInt();
System.out.println("enter the no of students placed in MECH: ");
int mech = sc.nextInt();
if(cse<0 || ece<0 || mech<0){
System.out.println("INVALID INPUT");
return;
}
if(cse==ece && cse==mech){
System.out.println("None of the department has got the highest placement");
}
else{
System.out.println("Highest placement");
if(cse>=ece && cse>=mech){
System.out.println("CSE");
}
if(ece>=cse && ece>=mech){
System.out.println("ECE");
}
if(mech>=cse && mech>=ece){
System.out.println("MECH");
}
}
}
}