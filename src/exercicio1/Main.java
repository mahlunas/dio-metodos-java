package exercicio1;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio Calculadora");
        calculadora.soma(2,6);
        calculadora.subtracao(8,3.7);
        calculadora.multiplicacao(2.5,7);
        calculadora.divisao(5,2);

        //Mensagem
        System.out.println("Exercicio Mensagem");
        mensagem.obterMensagem(8);
        mensagem.obterMensagem(16);
        mensagem.obterMensagem(23);

        //Empréstimo
        System.out.println("Exercicio Emprestimo");
        emprestimo.calcular(2000,emprestimo.getDuasParcelas());
        emprestimo.calcular(5000,emprestimo.getTresParcelas());
        emprestimo.calcular(6000,5);
    }
}
