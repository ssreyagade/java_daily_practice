// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            sc.nextLine();
        }
        
        int largest= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]>second && arr[i]!=largest){
                second=arr[i];
            }
        }
        
        System.out.println(second);
        
        
       
    }
}