import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho(); // Cria uma instância do cofrinho
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("Menu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarMoeda(cofrinho, scanner); // Adiciona uma moeda ao cofrinho
                    break;
                case 2:
                    removerMoeda(cofrinho, scanner); // Remove uma moeda do cofrinho
                    break;
                case 3:
                    cofrinho.listarMoedas(); // Lista todas as moedas no cofrinho
                    break;
                case 4:
                    // Calcula e exibe o valor total em Reais
                    System.out.println("Total em Reais: " + cofrinho.calcularTotalConvertido());
                    break;
                case 5:
                    System.out.println("Saindo..."); // Encerra o programa
                    break;
                default:
                    System.out.println("Opção inválida!"); // Trata opção inválida
            }
        } while (opcao != 5);

        scanner.close(); // Fecha o scanner
    }

    // Método para adicionar uma moeda ao cofrinho
    private static void adicionarMoeda(Cofrinho cofrinho, Scanner scanner) {
        System.out.println("Escolha o tipo de moeda:");
        System.out.println("1. Dolar");
        System.out.println("2. Euro");
        System.out.println("3. Real");
        int tipo = scanner.nextInt();
        System.out.print("Digite o valor da moeda: ");
        double valor = scanner.nextDouble();

        Moeda moeda = null;
        switch (tipo) {
            case 1:
                moeda = new Dolar(valor);
                break;
            case 2:
                moeda = new Euro(valor);
                break;
            case 3:
                moeda = new Real(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido!");
                return;
        }

        cofrinho.adicionarMoeda(moeda); // Adiciona a moeda ao cofrinho
        System.out.println("Moeda adicionada com sucesso!");
    }

    // Método para remover uma moeda do cofrinho
    private static void removerMoeda(Cofrinho cofrinho, Scanner scanner) {
        System.out.println("Escolha o tipo de moeda para remover:");
        System.out.println("1. Dolar");
        System.out.println("2. Euro");
        System.out.println("3. Real");
        int tipo = scanner.nextInt();
        System.out.print("Digite o valor da moeda: ");
        double valor = scanner.nextDouble();

        Moeda moeda = null;
        switch (tipo) {
            case 1:
                moeda = new Dolar(valor);
                break;
            case 2:
                moeda = new Euro(valor);
                break;
            case 3:
                moeda = new Real(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido!");
                return;
        }

        cofrinho.removerMoeda(moeda); // Remove a moeda do cofrinho
        System.out.println("Moeda removida com sucesso!");
    }
}
