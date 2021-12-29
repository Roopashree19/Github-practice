import java.util.Scanner;
public class usermeow {
public static void main(String[] args){
Scanner Sc1 = new Scanner(System.in);
while(true){
    System.out.println("Enter q to exit");
    System.out.print("Enter your name:");
    String a=Sc1.nextLine();
    if(a.equals("q")){
        System.out.println("happy coding!");
         Sc1.close();
         System.exit(0);
    }else if(a.length()<3 || a.length()>8){
        System.out.println("Invalid Nmae");

    }else{
        System.out.println("your name is"+a);
    }
}

}
}