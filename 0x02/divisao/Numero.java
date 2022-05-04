public class Numero {
    public static void dividir(int a, int b) {
        int rs = 0;
        try{
            rs = a / b;
        } catch (ArithmeticException e){
            System.out.println("Não eh possivel dividir por 0");
        } finally {
            System.out.println (a + " / " + b + " = " + rs);
        }
    }
}
