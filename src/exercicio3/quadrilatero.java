package exercicio3;

public class quadrilatero {
    public static double area(double lado)
    {
        return lado*lado;
    }
    public static double area(double l1,double l2)
    {
        return l1*l2;
    }
    public static double area(double bMaior, double bMenor, double altura)
    {
        return (bMaior+bMenor)*altura;
    }
}
