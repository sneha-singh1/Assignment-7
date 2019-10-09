import java.util.Scanner;
public class Search{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="";
        char a;
        System.out.println("Enter String");
        str=s.next();
        System.out.println("Enter element to search");
        a=s.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(a==str.charAt(i)){
                System.out.println(i);
            }
        }
    }
}