
//display arr using recursion
public class Q4 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        
        printarrev(arr,0);

    }
    public static void printarr(int arr[],int n){
        if (n==arr.length) {
           return;
            
        }
        System.out.println(arr[n]);
        printarr(arr,n+1);
        

    }

    public static void printarrev(int arr[],int n){
        if (n==arr.length) {
           return ;
            
        }
        printarr(arr,n+1);
        System.out.println(arr[n]);
        
       
        
       
        
        

    }
    
}
