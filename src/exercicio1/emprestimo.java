package exercicio1;

public class emprestimo {
    public static int getDuasParcelas()
    {
        return 2;
    }
    public static int getTresParcelas()
    {
        return 3;
    }
    public static double taxaDuasParcelas()
    {
        return 0.2;
    }
    public static double taxaTresParcelas()
    {
        return 0.27;
    }
    public static void calcular(double valor, int parcelas)
    {
        if (parcelas == 2)
        {
            double total = valor + (valor * taxaDuasParcelas());
            System.out.println("Valor final do emprestimo: "+total);
        }
        else{
            if (parcelas == 3)
            {
                double total = valor + (valor * taxaTresParcelas());
                System.out.println("Valor final do emprestimo: "+total);
            }
            else
            {
                System.out.println("Quantidade de parcelas INDISPONIVEIS");
            }
        }
    }
}
