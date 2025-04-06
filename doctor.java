import java.util.Scanner;
import java.util.ArrayList;
public class doctor {
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter age of the patients: (enter without value to stop!)");
ArrayList<Integer> ages = new ArrayList<>();
int totalIncome=0;
while(ages.size()<20){
String input = sc.nextLine();
 if (input.isEmpty()) {
                break;
            }
            
            boolean isValid = true;
            for (char c : input.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isValid = false;
                    break;
                }
            }
            
            if (!isValid) {
                System.out.println("INVALID INPUT");
                return;
            }
            
            int age = Integer.parseInt(input);
            if (age <= 0 || age > 120) {
                System.out.println("INVALID INPUT");
                return;
            }
            
            ages.add(age);
        }
        
        for (int age : ages) {
            if (age < 17) {
                totalIncome += 200;
            } else if (age >= 17 && age <= 40) {
                totalIncome += 400;
            } else {
                totalIncome += 300;
            }
        }
        
        System.out.println("Total Income " + totalIncome + " INR");
    }
}

