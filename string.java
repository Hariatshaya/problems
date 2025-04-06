public class string {
public static void main(String[] args){
String str1 ="hello world";
String str2 ="do";
int count=0;
for(int i=0;i<str1.length();i++){
char ch1=str1.charAt(i);
for(int j=0;j<str2.length();j++){
char ch2=str2.charAt(j);
if(ch1==ch2){
count++;
}
}
}
System.out.println(count);
}
}
