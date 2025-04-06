import java.util.Scanner;
public class coffeetea {
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the first letter to select the menu: ");
System.out.println("c-coffee");
System.out.println("t-tea");
System.out.println("s-soups");
System.out.println("b-beverages");
char mainmenu = Character.toLowerCase(sc.next().charAt(0)); 
String [][] menu={{"Espresso Coffee","Cappuccino Coffee","Latte Coffee"},
                  {"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"},
                  {"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"},
                  {"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"}};
int menuindex;
switch(mainmenu){
case 'c': menuindex =0;break;
case 't': menuindex =1;break;
case 's': menuindex =2;break;
case 'b': menuindex =3;break;
default:
System.out.println("INVALID INPUT");
return;
}
int subMenuChoice = sc.nextInt();
if (subMenuChoice >= 1 && subMenuChoice <= menu[menuindex].length) {
System.out.println("Welcome to CCD!");
System.out.println("Enjoy your " + menu[menuindex][subMenuChoice - 1] + "!");
} else {
System.out.println("INVALID INPUT");
}
}
}