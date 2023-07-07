import java.util.*;
class cyclebfs{
   public static boolean  findcycle(int graph[][],int src,int v,int visited[]){
            int parent[]=new int[v];
            Arrays.fill(parent,-1);
            Queue<Integer> q=new LinkedList<>();
            q.add(src);
            visited[src]=1;
            while(!q.isEmpty()){
                int u=q.poll();
                for(int i=0;i<v;i++){
                     if(graph[u][i]==1){
                      if(visited[i]==0){
                            parent[i]=u;
                            q.add(i);
                            visited[i]=1;
                            System.out.println(parent[i]);
                      }
                      else if(parent[u]!=i){
                         return true;
                      }
                    }
                }
            }
                     return false;
   }
    public static boolean iscycle(int graph[][],int v){
         int visited[]=new int[v];
           for(int i=0;i<v;i++){
               visited[i]=0;
           }
           
            for(int i=0;i<v;i++){
                if(visited[i]==0 && findcycle(graph,i,v,visited)){
                    return true;
                }
            }
            return false;

    }
    public static void main(String[] args){
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
        if(iscycle(graph,V))
         System.out.println("graph contain cycle");
         else
         System.out.println("graph do not contain cycle");    
    }
}