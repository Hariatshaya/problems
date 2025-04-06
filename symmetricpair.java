public class symmetricpair {
public static void main(String[] args){
int [][]arr={{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
int n=arr.length;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]){
System.out.print("(" + arr[i][0] + ","+ arr[i][1] +")");
}
}
}
}
}