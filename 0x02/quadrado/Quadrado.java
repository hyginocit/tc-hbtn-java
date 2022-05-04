public class Quadrado {
    public static double area(double lado) {
        double result = 0;
        try {
             result = lado * lado;
            if (lado < 0) {
                throw new IllegalArgumentException();
            }


        } catch (IllegalArgumentException e) {
            System.out.println("Lado deve possuir valor positivo");

        }
        return result;
    }

}
