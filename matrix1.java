import java.util.Scanner;
public class matrix1 {
public static void main(String [] args){
int max=0;
int maxindex=-1;
Scanner sc=new Scanner(System.in);
System.out.println("enter rows: ");
int row=sc.nextInt();
System.out.println("enter cols: ");
int col=sc.nextInt();
int [][]matrix=new int [row][col];
System.out.println("enter matrix: ");
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
matrix[i][j]=sc.nextInt();
}
}
for(int i=0;i<matrix.length;i++){
int count=0;
for(int j=0;j<col;j++){
if(matrix[i][j]==1){
count++;
}
}
if(count>max){
max=count;
maxindex=i;
}
}
if(maxindex!=-1){
System.out.println("row with most 1's is: "+maxindex);

        } else {
            System.out.println("No row with 1s found.");
        }

}
}