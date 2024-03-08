public class Main{
    public static void main(String[] args) {
        Test01.imprimeSoma();
        Test02.sequenciaFibonacci();
        Test03.imprimeTest03();
        Test04.imprimeTest04();
        System.out.println();
        Test05 test = new Test05("Me contrata");
        String reversedString = test.inverterString();
        System.out.println("String invertida: " + reversedString);

    }
}