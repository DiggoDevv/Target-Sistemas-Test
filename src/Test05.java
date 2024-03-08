public class Test05 {
    private String input;
    public Test05(String input) {
        this.input = input;
    }
    public String inverterString() {
        char[] caracteres = input.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        return new String(caracteres);
    }
}