import java.util.*;
class dijkstras{
    static int min(int dis[],int vis[],int v){
        int min=Integer.MAX_VALUE,index=-1;
        for(int i=0;i<v;i++){
            if(vis[i]==0 && dis[i]<=min){
                min=dis[i];
                index=i;
            }
        }
        return index;
    }
    static void findsortestpath(int graph[][],int v){
            int distance[]=new int[v];
            int vis[]=new int[v];
            Arrays.fill(vis,0);
            Arrays.fill(distance,Integer.MAX_VALUE);
            distance[0]=0; 
          
                                   int parent[]=new int[v];
                                  parent[0]=-1;
            for(int i=0;i<v;i++){
                int u=min(distance,vis,v);
                vis[u]=1;
                for(int j=0;j<v;j++){
                    if(vis[j]==0 && graph[u][j]!=0 && distance[u]!=Integer.MAX_VALUE && graph[u][j]+distance[u]<distance[j]){
                        distance[j]=graph[u][j]+distance[u];
                        parent[j]=u;
                        System.out.println("hello");
                    }
                }
            }
            
            System.out.println("vertex- "+"parnet- "+"distance- ");
            for(int i=0;i<v;i++){
                System.out.println(i+" "+parent[i]+"  "+"["+distance[i]+"]");
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
         findsortestpath(graph,V);
      }
}