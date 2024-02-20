import java.util.Scanner;

public class conta_bancaria {
    public static void main(String[] args) {
        String nome = "Antonio";
        String tipoConta = "corrente";
        double saldo = 8000;
        int opcao = 0;

        System.out.println("**************************************");
        System.out.println("\nDADOS DO CLIENTE:");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("saldo atual: " + saldo);
        System.out.println("\n************************************");
        System.out.println("\nOperações:");

        String menu = """
                #Digite sua opção#
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner (System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual:" + saldo);
            } else if (opcao == 2) {
                System.out.println("Quanto deseja transferir" );
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente para transação");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Saldo atual:" + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido:");
                double valor = leitura.nextDouble();
                saldo = saldo + valor;
                System.out.println("Saldo atual:" + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida!");
            }
        }
    }
}
   