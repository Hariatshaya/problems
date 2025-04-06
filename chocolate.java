public class chocolate {
public static void main(String [] args){
int []a={1,3,0,0,3,2};
int index=0;
for(int i=0;i<a.length;i++){
if(a[i]!=0){
int temp=a[i];
a[i]=a[index];
a[index]=temp;
index++;
}
}
for (int num : a) {
System.out.print(num + " ");
}
}
}