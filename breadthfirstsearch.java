import java.util.*;

class breadthfirstsearch{

    public static void traversal(int graph[][],int V,int src,int des){
            int visited[]=new int[V];
            
            for(int i=0;i<V;i++){
                visited[i]=0;               
            }
            visited[src]=1;
            System.out.print(src);
            Queue<Integer> queue=new LinkedList<>();
            queue.add(src);
            while(!queue.isEmpty()){
                int u=queue.poll();
                for(int i=0;i<V;i++){
                    if(visited[i]==0 && graph[u][i]==1){
                     queue.add(i);
                     visited[i]=1;
                     System.out.print(i);
                      if(des==i){///////////////////////path find from sourcde to destination 
                        System.out.println("true");
                    }
                    }
                   
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
      
            System.out.println("enter source");
            int src=sc.nextInt(); 
       traversal(graph,V,src,2);
    }
}