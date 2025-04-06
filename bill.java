import java.util.Scanner;
public class bill {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of pizzas bought: ");
int pizza = sc.nextInt();
System.out.println("Enter the number of puffs bought: ");
int puffs = sc.nextInt();
System.out.println("Enter the number of cool drinks bought: ");
int cooldrinks = sc.nextInt();
int pizzabill = 100*pizza;
int puffsbill = 20*puffs;
int drinksbill = 10*cooldrinks;
int totalbill = pizzabill + puffsbill + drinksbill;
System.out.println("Bill Details");
System.out.println("no.of pizzas: " + pizza);
System.out.println("no.of puffs: " + puffs);
System.out.println("no.of cool drinks: " + cooldrinks);
System.out.println("total price: " + totalbill);
System.out.println("ENJOY THE SHOW!!");
}
}