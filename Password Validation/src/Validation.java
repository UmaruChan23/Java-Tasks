//Hello@$World19
import java.util.Scanner;
public class Validation {
    public static void evaluate(String temp){
        String numbers="12345676890";
        String spesial="!@#$%&*";
        int nCount=0;
        int sCount=0;
        if(temp.length()<7) {
            System.out.println("Weak");
        }
        else{
                for(int i=0;i<temp.length();i++){
                    if(numbers.contains(String.valueOf(temp.charAt(i)))){
                        nCount++;
                    }
                    else if(spesial.contains(String.valueOf(temp.charAt(i)))){
                        sCount++;
                    }
                    if(nCount>=2 && sCount>=2) break;
                }
            if(nCount<2 || sCount<2) {
                System.out.println("Weak");
            }
            else{System.out.println("Strong");}
            }

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();
        evaluate(pass);
    }
}
