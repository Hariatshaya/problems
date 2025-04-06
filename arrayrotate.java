import java.util.Arrays;
public class arrayrotate {
public static void main(String[] args){
int d=5;
int []a={1,2,3};
for(int i=0;i<d;i++){
int temp=a[0];
for(int j=0;j<a.length-1;j++){
a[j]=a[j+1];
}
a[a.length - 1] =temp;
}
System.out.println(Arrays.toString(a));
}
}