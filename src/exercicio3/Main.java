package exercicio3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio quadrilatero com retorno");
        double areaQuadrado = quadrilatero.area(3);
        System.out.println("Area do quadrado: "+areaQuadrado);
        double areaRetangulo = quadrilatero.area(5,6);
        System.out.println("Area do retangulo: "+areaRetangulo);
        double areaTriangulo = quadrilatero.area(7,8,9);
        System.out.println("Area do triangulo: "+areaTriangulo);
    }
}
