import java.util.Scanner;
public class Security {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String floor = scan.nextLine();
        int money = floor.indexOf('$');
        int thief = floor.indexOf('T');
        int guard1 = floor.indexOf('G');
        int guard2 = floor.lastIndexOf('G');
        if(((money>guard1) && (guard1>thief)) || ((money<guard1) && (guard1<thief))) {
            System.out.println("quiet");
        }
        else if(((money>guard2) && (guard2>thief)) || ((money<guard2) && (guard2<thief))) {
            System.out.println("quiet");
        }
        else System.out.println("ALARM");

    }

}
