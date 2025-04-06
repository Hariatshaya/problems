import java.util.Scanner;
public class words {
public static void main (String [] args){
Scanner sc =  new Scanner(System.in);
String a = sc.nextLine();
String b = sc.nextLine();
String c = sc.nextLine();
StringBuilder a1 = new StringBuilder(a);
StringBuilder b1 = new StringBuilder(b);
for(int i=0;i<a.length();i++){
char ch1 = a1.charAt(i);
if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
a1.setCharAt(i,'%');

}
}
for(int i=0;i<b.length();i++){
char ch2 = b1.charAt(i);
if(ch2!='a' && ch2!='e' && ch2!='i' && ch2!='o' && ch2!='u'){
b1.setCharAt(i,'#');

}
}
String C = c.toUpperCase();
System.out.println(a1.toString() + b1.toString() + C);
}
}