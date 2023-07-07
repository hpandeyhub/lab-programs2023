import java.util.*;
class matrix_chain_multiplication{
    static int  find(int array[],int i,int j){
        if(i==j){
            return 0;
        }
        int min_count=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int count=find(array,i,k)+find(array,k+1,j)+array[i-1]*array[k]*array[j];
            if(count<min_count)
              min_count=count;
        }

        return min_count;
    }
    public static void main(String[] args) {
       System.out.println("enter no of matrix");
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int array[]=new int[n];
         System.out.println("enter values");
         for(int i=0;i<n;i++){
              array[i]=sc.nextInt();
         }
         System.out.println("no  of operations"+find(array,1,n));

    }
}