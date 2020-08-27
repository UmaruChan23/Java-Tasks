import java.util.Scanner;
public class SpyLife {
    public static String reverse(String s){
        String result="";
        for(int i=0;i<s.length();i++){
            result=s.charAt(i)+result;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        String notStr="!@#$%^&*()_-+=1234567890{}[]:;|<>/~`";
        String result="";
        for(int i=0;i<temp.length();i++){
            if(!(notStr.contains(String.valueOf(temp.charAt(i))))){
                result=result+String.valueOf(temp.charAt(i));
            }
        }
        System.out.println(reverse(result));
    }
}
