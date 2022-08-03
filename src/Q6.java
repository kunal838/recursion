import java.util.*;

//printing all permutation
public class Q6 {
    public static void PrintPermutation(String ques,String asf){
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0, i);
            String qrpart = ques.substring(i+1);
            String roq = qlpart+qrpart;
            PrintPermutation(roq, ch+asf);

        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string to find its permutation");
        String m = in.next();
        PrintPermutation(m,"");
        
    }
}

