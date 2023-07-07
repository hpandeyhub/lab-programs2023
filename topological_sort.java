import java.util.*;

class topological_sort{
    static int j;
    // static graph g[];
   static void  findtoposort(int v,int src,Stack<Integer> stack,int visited[]){
    
               visited[src]=1;
               for(int i=0;i<v;i++){
                if(visited[i]==0){
                 findtoposort(v,i,stack,visited);
                } 
               }

              stack.push(src);
   }


  static void topological(int v){
    int visited[]=new int[v];
     Arrays.fill(visited,0);
   Stack<Integer> stack=new Stack<Integer>();
    for(int i=0;i<v;i++)
      if(visited[i]==0)
         findtoposort(v, i, stack, visited);

    print(stack);     
  }
static void print(Stack<Integer> s){
    while(s.size()!=0)
     System.out.println(s.pop());
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

              topological(V);

    }
}