// x^n using recursion also manage for 0

public class Q3 {
    public static void main(String[] args) {
        System.out.println(lp(2, 3));
    }

    static int lp(int x,int n){
        if(n==0){
            return 1;
        }
        
       int xp = lp(x,n-1);
        int p= x*xp;
        return p ;


    }
    
}
