// factorial using recursion
public class Q2 {
    static int  factorial(int n){
        if (n==1){
            return 1;
            
        }
        int fnm1 = factorial(n-1);
        int fn = fnm1*n;
        return fn;


    }
    public static void main(String[] args) {
       System.out.println(factorial(5)); 
    }
    
}
