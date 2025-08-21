import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Orcamento orcamento = JsonUtils.carregar();

        while (true) {
            System.out.println("\n--- Calculadora de Orçamento Pessoal ---");
            System.out.println("1 - Adicionar Receita");
            System.out.println("2 - Adicionar Despesa");
            System.out.println("3 - Mostrar Resumo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Valor da receita: ");
                    double valorR = Double.parseDouble(sc.nextLine());
                    System.out.print("Descrição: ");
                    String descR = sc.nextLine();
                    orcamento.adicionarReceita(valorR, descR);
                    JsonUtils.salvar(orcamento);
                    break;

                case "2":
                    System.out.print("Valor da despesa: ");
                    double valorD = Double.parseDouble(sc.nextLine());
                    System.out.print("Descrição: ");
                    String descD = sc.nextLine();
                    System.out.print("Categoria: ");
                    String cat = sc.nextLine();
                    orcamento.adicionarDespesa(valorD, descD, cat);
                    JsonUtils.salvar(orcamento);
                    break;

                case "3":
                    System.out.println("\nResumo Financeiro:");
                    System.out.printf("Receitas: R$ %.2f%n", orcamento.totalReceitas());
                    System.out.printf("Despesas: R$ %.2f%n", orcamento.totalDespesas());
                    System.out.printf("Saldo: R$ %.2f%n", orcamento.saldo());
                    break;

                case "0":
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
