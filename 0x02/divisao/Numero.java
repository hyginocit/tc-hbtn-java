public class Numero {
    public static void dividir(int a, int b) {
        int rs = 0;
        try{
            rs = a / b;
        } catch (ArithmeticException e){
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            System.out.println (a + " / " + b + " = " + rs);
        }
    }
}
