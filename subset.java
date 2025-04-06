public class subset {
public static void main(String[] args){
int [] a={10, 5, 2, 23, 19};
int [] b={19, 5, 3};
boolean issubset=true;
for(int i=0;i<a.length;i++){
boolean found=false;
for(int j=0;j<b.length;j++){
if(b[j]==a[i]){
found=true;
break;
}
}
if(!found){
issubset=false;
break;
}
}
System.out.println(issubset);
}
}