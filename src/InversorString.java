import java.util.Scanner;

public class InversorString {

    public static void inverte(){

        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite uma String: ");
        s=sc.nextLine();

        System.out.print("String invertida: ");

        for(int i=s.length(); i>0 ; --i)
        {
            System.out.print(s.charAt(i-1));
        }

    }
}
