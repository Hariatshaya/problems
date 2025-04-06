import java.util.Scanner;
public class IncrementCalculation {
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the salary: ");
double salary = sc.nextDouble();
System.out.println("Enter the performance appraisal rating");
double rating = sc.nextDouble();
if(salary <=0 || rating<1 || rating>5){
System.out.println("Invalid input");
return;
}
double increment;
if(rating>=1 && rating<=3){
increment = salary + (salary*0.10);
}
else if(rating>3 && rating<=4){
increment = salary + (salary*0.25);'
}
else{
increment = salary + (salary*0.30);
}
System.out.println((int)increment);
}
} 