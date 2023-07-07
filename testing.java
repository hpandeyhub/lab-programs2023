import java.util.*;
class testing{
    static void find(int n){
        if(n==0)
        return;
        n=n-1;
        find(n);
        System.out.println(n+"123");
    }
    public static void main(String[] args) {
        find(5);
        
    }
}