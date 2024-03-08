public class Test01 {

    public static int indice = 13, soma = 0, K = 0;
    public static void imprimeSoma() {
        while (K < indice) {
            K += 1;
            soma = soma + K;

            System.out.println(soma);
        }
    }

}
