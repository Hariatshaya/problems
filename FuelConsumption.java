import java.util.Scanner;

public class FuelConsumption {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no of liters to fill the tank");
float liters = sc.nextFloat();
if (liters <= 0) {
System.out.printf("%.0f is an Invalid Input\n", liters);
return;
}
System.out.println("Enter the distance covered");
float distance = sc.nextFloat();
if (distance <= 0) {
System.out.printf("%.0f is an Invalid Input\n", distance);
return;
}
float ltrPer100km = (liters / distance) * 100;
float miles = distance * 0.6214f;
float gallons = liters * 0.2642f;
float mpg = miles / gallons;
System.out.printf("Liters/100KM\n%.2f\n", ltrPer100km);
System.out.printf("Miles/gallons\n%.2f\n", mpg);
}
}
