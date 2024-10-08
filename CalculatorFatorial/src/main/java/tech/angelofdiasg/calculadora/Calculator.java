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
    //Fiz um func simples de soma utilizando Varargs
    public double soma(double... n){
        //criando e setando a variavel total como 0

        double total = 0;
        //iniciando um for para somar tudo
        for (double Numero : n) {
            //fazendo a soma e fazendo o total ser igual aos Numeros
            total += Numero;
        }
        return  total;
    }
    public double mult(double... n){
        double total = 1;
        for (double Numero: n){
            total *= Numero;
        }
        return total;
    }

    public double sub(double... n) {
        if (n.length == 0) return 0;

        double total = n[0];
        for (int i = 1; i < n.length; i++) {
            total -= n[i];
        }
        return total;
    }
    //tive que pedir ajuda do chat na div pq tava dando erros que eu não consegui resolver
    //não sei como mas ok
    public double div(double... n) {
        double total = n[0];
        for (int i = 1; i < n.length; i++) {
            total /= n[i];
        }
        return total;
    }

    public double potencia(double base, int expoente) {
        double resultado = 1;
        for (int i = 0; i < Math.abs(expoente); i++) {
            resultado *= base;
        }
        return (expoente < 0) ? 1 / resultado : resultado;
    }

}

