import java.util.Scanner;
public class magicboard {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int [] digits = new int[4];
for(int i=0;i<4;i++){
digits[i] = sc.nextInt();
}
for(int i=0;i<4;i++){
char ch = (char) digits[i];
System.out.println(digits[i] + "-" + ch);
}
}
}