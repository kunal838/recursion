
//print decreasing increasing
public class App {

    static void pdi(int n){
        if(n==0){
            return;
        }
        

        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
       
       


    }
    public static void main(String[] args) throws Exception {
        
        pdi(5);
    }  
    
   
}      
