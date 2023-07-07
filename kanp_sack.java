import java.util.*;
class knap_sack{
    static int max(int a,int b){
        return a>b?a:b;
    }
      static void find(int weight[],int profit[],int w){
             int n=weight.length;
             int matrix[][]=new int[n+1][w+1];
             for(int i=0;i<=n;i++){
               
                matrix[i][0]=0;
             }
              for(int i=0;i<=w;i++){
                matrix[0][i]=0;
                
             }
             for(int i=1;i<=n;i++){
                for(int j=1;j<=w;j++){
                    if(j>=weight[i-1]){
                        matrix[i][j]=max(profit[i-1]+matrix[i-1][j-weight[i-1]],matrix[i-1][j]);
                    }
                    else{
                        matrix[i][j]=matrix[i-1][j];
                    }
                }
             }
             for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    System.out.print(matrix[i][j]);
                }
                 System.out.println();
             }
        }
    public static void main(String[] args) {
        int profit[]={2,3,1,4};
        int weight[]={3,4,6,5};
        int w=8;
        ////weight sort///
         
        for(int i=0;i<weight.length;i++){
            int min=i;
            for(int j=i+1;j<weight.length;j++){
                if(weight[min]>weight[j]){
                    min=j;
                }

                if(min!=i){
                        int temp=weight[i];
                        int temp1=profit[i];
                        weight[i]=weight[min];
                        weight[min]=temp;
                        profit[i]=profit[min];
                        profit[min]=temp1;
                    }
                
            }

        }
        for(int i=0;i<weight.length;i++){
            System.out.println(weight[i]+" "+profit[i]);
        }
        find(weight,profit,w);

    }
}