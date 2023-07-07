import java.util.*;////////////////////////////abhi pura nahi hua hai 
class cycledfs{
    static boolean findcycle(int graph[][],int v,boolean visited[],int src,int parent[]){
                visited[src]=true;
                System.out.print(src);
                for(int i=0;i<v;i++){
                    if(graph[src][i]==1){
                        if(!visited[i]){
                            parent[i]=src;
                            findcycle(graph,v,visited,i,parent);
                        }
                        else if(parent[src]!=i)
                               System.out.println("graph contain cycle");
                                return true;
                    }
                    
                }
                return false;
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
        int parent[]=new int[V];
        Arrays.fill(parent,-1);
         if(findcycle(graph,V,visited,src,parent)){
            System.out.println("graph contain cycyle");
         }
         else 
         System.out.println("graph do not contain cycyle");
    }
}