import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;

        System.out.println("-- Questao 2 --");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Digite um numero nao-negativo: ");
            num = sc.nextInt();
        }while(num<0);

        System.out.println(Fibonacci.sequencia(num));

        System.out.println("-- Questao 5 --");
        InversorString.inverte();

    }
}