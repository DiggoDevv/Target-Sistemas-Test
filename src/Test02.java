public class Test02 {
    public static int num1 = 0, num2 = 1;

    public static void sequenciaFibonacci(){
        for(int i = 0; i < 8; i++){
            System.out.println("sequencia de Fibonacci: " + num1);
            num2 = num1 + num2;
            num1 = num2-num1;
        }
    }
}
