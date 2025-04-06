public class starhash {
public static void main (String[] args){
String a="**###";
int count1=0;
int count2=0;
for(int i=0;i<a.length();i++){
char ch=a.charAt(i);
if(ch=='*'){
count1++;
}
else if(ch=='#'){
count2++;
}
}
if(count1==count2){
System.out.println("0");
}
else if(count1>count2){
System.out.println("positive integer");
}
else{
System.out.println("negative integer");
}
}
}