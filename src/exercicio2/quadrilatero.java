package exercicio2;

public class quadrilatero {
    public static void area(double lado)
    {
        System.out.println("Area do quadrado: "+(lado*lado));
    }
    public static void area(double l1, double l2)
    {
        System.out.println("Area do retangulo: "+(l1*l2));
    }
    public static void area(double bMaior, double bMenor, double altura)
    {
        System.out.println("Area do triangulo: "+((bMaior+bMenor)*altura));
    }
}
