import java.util.Arrays;
public class arrayrotateright {
public static void main(String[] args){
int d=2;
int []a={1,2,3};
for(int i=0;i<d;i++){
int temp=a[a.length-1];
for(int j=a.length-1;j>0;j--){
a[j]=a[j-1];
}
a[0] =temp;
}
System.out.println(Arrays.toString(a));
}
}