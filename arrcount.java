public class arrcount {
public static void main(String[] args){
int []arr={7,4,8,2,9};
int count=1;
for(int i=0;i<arr.length-1;i++){
if(arr[i]<arr[i+1]){
count++;
}
}
System.out.println(count);
}
}