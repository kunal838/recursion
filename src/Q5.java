import java.util.Scanner;

//generating all subsequesnce
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string to find its subsequence");
        String str = in.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }
    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for( String res:rres){
            mres.add(""+res);

        }
        for( String res:rres){
            mres.add(ch+res);

        }
        return mres;



    }
    
}
