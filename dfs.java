import java.util.*;
class dfs{
    static void finddfs(int graph[][],int v,boolean visited[],int src,int des){
          System.out.print(src);
            visited[src]=true;
           
            for(int i=0;i<v;i++){
                if(!visited[i] && graph[src][i]==1){
                                                             if(des==i)///////////////find path exist or not///////////////////////
                                                           System.out.println("true");
                          finddfs(graph,v,visited,i,des);
                }
              

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
             boolean visited[]=new boolean[V];
             Arrays.fill(visited,false);
             
            System.out.println("enter source");
            int src=sc.nextInt(); 
            
             finddfs(graph,V,visited,src,4);
          
    }
}