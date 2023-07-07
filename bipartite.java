/////////////bipartite
import java.util.*;
class bipartite{
    static boolean checkbipartite(int graph[][],int v,int src){
        int color[]=new int[v];
        Arrays.fill(color,-1);
        color[src]=1;
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int u=q.poll();
            for(int i=0;i<v;i++){
                 if(graph[u][i]==1 && color[i]==-1){
                    color[i]=1-color[u];
                    q.add(i);
                 }
                 else if(graph[u][i]==1 && color[i]==color[u])
                    return false;
            }
        }
        return true;
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
      
            System.out.println("enter source");
            int src=sc.nextInt(); 
            if(checkbipartite(graph,V,src))
             System.out.println("graph is bipartite");
             else
             System.out.println("graph is not bipartite");
    }
}