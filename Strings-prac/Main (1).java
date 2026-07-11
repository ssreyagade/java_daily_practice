// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String sb=str;
        
        
        for(int i=0;i<sb.length();i++){
            char ch= sb.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                sb=sb.replace(sb.valueOf(ch),"");
            }
            
        }
        System.out.println(sb);
        
        
        
        
       
    }
}