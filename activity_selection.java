import java.util.*;
class activity_selection{
    public static void main(String[] args) {
         int start[]={1,3,0,5,3,5,6,7,14};
         int end[]={5,5,6,7,9,9,10,14,15};
        
            int count=1;
            int k=0;
            for(int j=1;j<start.length;j++){
                if(start[j]>=end[k]){
                   
                    System.out.println(start[k]+"-"+end[k]);
                    count++;
                     k=j;
                }
            }
               System.out.println(""+count);
            
    
        //    int i=0;
        //    System.out.println(start[i]+"-"+end[i]);
        //    for(int j=0;j<start.length;j++){
        //        if(start[j]>=end[i]){
        //         System.out.println(start[j]+"-"+end[j]);
        //         i=j;
        //        }
        //    }
     }
    }
