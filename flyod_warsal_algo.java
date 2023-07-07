import java.util.*;
class flyod_warsal_algo{
    static int inf=9999;
    static void assp(int graph[][],int n){
        int matrix[][]=new int[n][n];    
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 matrix[i][j]=graph[i][j];
            }}

    for(int k=0;k<n;k++){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(matrix[i][k]+matrix[k][j]<matrix[i][j])
                   matrix[i][j]=matrix[i][k]+matrix[k][j];
            }
        }
    }
    print(matrix,n);
}
static void print(int matrix[][],int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]==inf)
             System.out.println("inf");
             else
            System.out.print(matrix[i][j]+",");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    System.out.println("enter no of vartex");
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int array[][]=new int[n][n];
     System.out.println("enter values");
     for(int i=0;i<n;i++){
        for(int h=0;h<n;h++)
          array[i][h]=sc.nextInt();
     }
        
  
     assp(array,n);
}
}