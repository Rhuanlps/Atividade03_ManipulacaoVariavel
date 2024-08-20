import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        // Informações
        String produto = "Teclado Mecânico";
        double prcTecMec = 150.60;
        int qtdTecMec = 38;

        double txa = (double) 90 /100;
        double lcr = (double) 30 /100;

        // Cálculos
        // Primeiro cálcula o preço total de teclados mêcanicos
        // Segundo pega o preço total de teclados mecânicos e adiciona a taxa
        // Terceiro chega no preço final tendo já em conta 30% de lucro
        double prcTtlTecMec = prcTecMec * qtdTecMec;
        double prcTtlTecMecTxa = (prcTtlTecMec * txa) + prcTtlTecMec;
        double prcFinalTecMec = (prcTtlTecMecTxa * lcr) + prcTtlTecMecTxa;

        // Definir padrão
        // Cria um padrão novo com "R$", até 100mil não precisa ter número,
        // mas na casa "unidade" caso não tenha número, sera definido como "0".
        // Define o "padrao" como um novo formato decimal (DecimalFormat)
        // Cria um segundo padrão pra porcentagem (belo espaguete)
        String padrao = "R$ ###,##0.00";
        DecimalFormat df = new DecimalFormat(padrao);
        String padrao2 = "00";
        DecimalFormat df2 = new DecimalFormat(padrao2);

        // Mensagens
        System.out.println("Agora com a nova taxa de " + df2.format(txa * 100) + "% que o governo aprovou,\n" + "vai ser difícil vender o " + produto + ".");
        System.out.println("Nosso forcenecedor nos vende a " + df.format(prcTecMec) + " cada teclado,\n" + "e acabamos de comprar mais " + qtdTecMec + " teclados.");
        System.out.println("No total isso dá " + df.format(prcTtlTecMec) + ". Isso é o valor sem as taxas,\n" + "com elas embutidas, fica " + df.format(prcTtlTecMecTxa) + "." );
        System.out.println("Se a gente vai querer lucrar " + df2.format(lcr * 100) + "%,\n" + "o preço final de tudo que temos ficará " + df.format(prcFinalTecMec) + ".");
    }

}