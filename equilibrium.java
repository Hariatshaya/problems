public class equilibrium {
public static void main(String[] args){
int [] a={-7, 1, 5, 2, -4, 3, 0};
int n=a.length;
int sum=0;
for(int i=0;i<n;i++){
sum+=a[i];
}
int lsum=0;
for(int i=0;i<n;i++){
sum-=a[i];
if (lsum == sum) {
System.out.println("Equilibrium index: " + i);
return;
}
lsum += a[i];
}
System.out.println("no equilibrium found");
}
}