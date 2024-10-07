package tech.angelofdiasg.calculadora;

public class Calculator {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    //Fiz um metodo simples de soma utilizando Varargs
    public double soma(double... N ){
        //criando e setando a variavel total como 0

        double total = 0;
        //iniciando um for para somar tudo
        for (double Numero : N) {
            //fazendo a soma e fazendo o total ser igual aos Numeros
            total += Numero;
        }
        return  total;
    }

    public double mult(double... N){
        double total = 1;
        for (double Numero: N){
            total *= Numero;
        }
        return total;
    }
}

