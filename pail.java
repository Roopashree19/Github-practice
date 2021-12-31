import java.util.*;

public class pail{
public static void main(String[] args) {
            int  rev=0,m;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int num=sc.nextInt();
            m=num;
            while(num>0){
                rev=(rev*10)+(num%10);
                num=num/10;
    
            }
            if(m==rev)
            System.out.println(m+"is a palindrome");
            else{
                System.out.println(m+"is not palindrome");
            }
        }
    } 

