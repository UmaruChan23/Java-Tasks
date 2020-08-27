import java.util.*;
public class Program
{
    public static int strToArr(String myName,String temp,int agents)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add(myName);
        String word="";
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i) != ' '){
                word+=temp.charAt(i);
            }
            else{
                list.add(word);
                word="";
            }
        }
        list.add(word);
        Collections.sort(list);
        double me = list.indexOf(myName) +1;
        return 20*(int)(Math.ceil(me/agents));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myName = sc.nextLine();
        int agents = Integer.parseInt(sc.nextLine());
        String other = sc.nextLine();
        System.out.println(strToArr(myName,other,agents));
    }
}