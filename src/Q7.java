import java.util.*;

//sum of subsets
public class Q7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int arr[] = {10,20,30};
        System.out.println("enter the target");
        int tar = scr.nextInt();
        PrintTargetSumSubset(arr,0,"",0,tar);


    }
    public static void PrintTargetSumSubset(int []arr,int idx,String set,int sos , int tar){
        if(idx==arr.length){
            if(sos==tar){
                System.out.println(set+"0");
            }
            return;
        }
        PrintTargetSumSubset(arr,idx+1,set+arr[idx]+"+",sos+arr[idx],tar);
        PrintTargetSumSubset(arr,idx+1,set,sos,tar);
    }
}
