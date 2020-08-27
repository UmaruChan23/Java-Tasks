import java.util.Scanner;
public class Program {
    public static int counter(String s){
        double result=0;
        double words=0;
        String notStr=".,!?@#$%^&*()_-+= 1234567890{}[]:;|<>/~`";
        for(int i =0;i<s.length();i++){
            if(!(notStr.contains(String.valueOf(s.charAt(i))))){
                result++;
            }
            else if(s.charAt(i)==' ') {
                words++;
            }
        }
        words++;
        return (int)Math.ceil(result/words);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        System.out.println(counter(temp));
    }
}
