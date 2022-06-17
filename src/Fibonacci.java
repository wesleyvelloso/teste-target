
public class Fibonacci {

    public static String sequencia(int num){

        int aux, anterior = 1, fib = 0;
        boolean contido= false;

        while(fib <= num){

            System.out.print(fib + " ");

            if(num == fib)
                contido = true;

            aux = fib;
            fib += anterior;
            anterior = aux;
        }

        System.out.println("");

        if (contido == true)
            return  "O numero inserido PERTENCE a sequencia de Fibonacci";
        else
            return "O numero inserido NAO PERTENCE a sequencia de Fibonacci";

    }

}
