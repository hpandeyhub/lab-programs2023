import java.util.*;
class bellmanford{
    static void findsortestpath(int graph[][],int v,int src){
         int dis[]=new int[v];
         int parent[]=new int[v];
         Arrays.fill(dis,Integer.MAX_VALUE);
         dis[src]=0;
         for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(graph[i][j]!=0 && dis[i]!=Integer.MAX_VALUE && dis[i]+graph[i][j]<dis[j]){
                    dis[j]=graph[i][j]+dis[i];
                    parent[j]=i;
                    System.out.println("asd0");
                }
            }
         }
         for(int i=0;i<v;i++){
            
         }
         for(int i=0;i<v;i++){
            System.out.print(dis[i]+" ");
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of vertex");
        int V=sc.nextInt();
        int graph[][]=new int[V][V];
        for(int j=0;j<V;j++){
            for(int i=0;i<V;i++)
                graph[j][i]=sc.nextInt();
             
         }
// 0 6 4 5 0 0
// 0 0 0 0 -1 0
// 0 -2 0 0 3 0
// 0 0 -2 0 0 -1
// 0 0 0 0 0 3
// 0 0 0 0 0 0


         findsortestpath(graph,V,0);
    }
}