// import java.util.*;
// class prims{
//     static int min(int visited[],int dis[]){
//         int min=Integer.MAX_VALUE, index=-1;
//         for(int i=0;i<dis.length;i++){
//        // System.out.println("elmenr");
//             if(visited[i]==0 && dis[i]<min){
//                 min=dis[i];
//                 index=i;

//             }
//         }
//         return index;
//     }
//     static void findmst(int graph[][],int v){
//         int visited[]=new int[v];
//         int parent[]=new int[v];
//         int dis[]=new int[v];
       
//         for(int i=0;i<v;i++){
//             visited[i]=0;
//             dis[i]=Integer.MAX_VALUE;
//         }
//          dis[0]=0;
//         parent[0]=-1;
//         for(int i=0;i<v-1;i++){
//             int u=min(visited,dis);
//             visited[u]=1;
             
//             for(int j=0;j<v;j++){
//                  if(visited[j]==0 && graph[u][j]!=0 && graph[u][j]<dis[j]){
//                     parent[j]=u;
//                     dis[j]=graph[u][j];
                  
//                  }
//             }
//         }

//         ///////////////
//         for(int i=0;i<v;i++){
//             System.out.println(parent[i]+" - "+graph[i][parent[i]]);
//         }
           
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//             System.out.println("enter no of vertex");
//             int V=sc.nextInt();
//             int graph[][]=new int[V][V];
//             for(int j=0;j<V;j++){
//                 for(int i=0;i<V;i++)
//                     graph[j][i]=sc.nextInt();
                 
//              }
           
//              findmst(graph,V);  
//     }
// }
import java.io.*;
import java.lang.*;
import java.util.*;
 
class MST {
 
    // Number of vertices in the graph
    private static final int V = 4;
 
    // A utility function to find the vertex with minimum
    // key value, from the set of vertices not yet included
    // in MST
    int minKey(int key[], Boolean mstSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;
 
        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }
 
        return min_index;
    }
 
    // A utility function to print the constructed MST
    // stored in parent[]
    void printMST(int parent[], int graph[][])
    {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t"
                               + graph[i][parent[i]]);
    }
 
    // Function to construct and print MST for a graph
    // represented using adjacency matrix representation
    void primMST(int graph[][])
    {
        // Array to store constructed MST
        int parent[] = new int[V];
 
        // Key values used to pick minimum weight edge in
        // cut
        int key[] = new int[V];
 
        // To represent set of vertices included in MST
        Boolean mstSet[] = new Boolean[V];
         int dis[]=new int[v];
        // Initialize all keys as INFINITE
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
            dis[i]=Integer.MAX_VALUE;
        }
 
        // Always include first 1st vertex in MST.
        // Make key 0 so that this vertex is
        // picked as first vertex
        key[0] = 0;
        
        // First node is always root of MST
        parent[0] = -1;
 
        // The MST will have V vertices
        for (int count = 0; count < V - 1; count++) {
             
            // Pick the minimum key vertex from the set of
            // vertices not yet included in MST
            int u = minKey(key, mstSet);
 
            // Add the picked vertex to the MST Set
            mstSet[u] = true;
 
            // Update key value and parent index of the
            // adjacent vertices of the picked vertex.
            // Consider only those vertices which are not
            // yet included in MST
            for (int v = 0; v < V; v++)
 
                // graph[u][v] is non zero only for adjacent
                // vertices of m mstSet[v] is false for
                // vertices not yet included in MST Update
                // the key only if graph[u][v] is smaller
                // than key[v]
                if (graph[u][v] != 0 && mstSet[v] == false
                    && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }
 
        // Print the constructed MST
        printMST(parent, graph);
    }
 
    public static void main(String[] args)
    {
        MST t = new MST();
        int graph[][] = new int[][] { { 0, 16, 11, 6},
                                      { 8, 0, 13, 16},
                                      { 4, 7, 0, 9},
                                      { 5, 12, 2, 0}
                                     };
 
        // Print the solution
        t.primMST(graph);
    }
}