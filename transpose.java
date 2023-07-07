import java.util.*;
class transpose{

    static boolean findtranspose(int graph1[][],int graph2[][],int v){
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                     if(graph1[i][j]==1 && i!=j){
                           if( graph2[j][i]!=1){
                            return false;
                           }      
                     }

            }
        
        }
return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter no of vertex for graph1");
            int V=sc.nextInt();
            int graph1[][]=new int[V][V];
            for(int j=0;j<V;j++){
                for(int i=0;i<V;i++)
                    graph1[j][i]=sc.nextInt();

             }  
             System.out.println("enter no of vertex for graph2");
             V=sc.nextInt();
            int graph2[][]=new int[V][V];
            for(int j=0;j<V;j++){
                for(int i=0;i<V;i++)
                    graph2[j][i]=sc.nextInt();
                 
             }
             if(findtranspose(graph1,graph2,V))
             System.out.println("graphs are transpose");
             else System.out.println("graphs are not transpose");
    }
}