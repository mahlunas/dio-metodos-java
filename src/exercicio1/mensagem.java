package exercicio1;

public class mensagem {
    public static void obterMensagem(int hora)
    {
        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> mensagemBomDia();
            case 13, 14, 15, 16, 17 -> mensagemBoaTarde();
            case 18, 19, 20, 21, 22, 23, 24, 0, 1, 2, 3, 4 -> mensagemBoaNoite();
            default -> System.out.println("Hora Inválida");
        }
    }

    public static void mensagemBomDia()
    {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde()
    {
        System.out.println("Boa Tarde!");
    }

    public static void mensagemBoaNoite()
    {
        System.out.println("Boa Noite!");
    }
}
