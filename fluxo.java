import java.util.Scanner;

public class fluxo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inicio>Cliente entra na JavaStore");
        System.out.println("Bem-vindo à JavaStore! Explora produtos...");

        explorarProdutos(scanner);

        System.out.println("Cliente encontrou o produto desejado.");

        if (desejaAjuda(scanner)) {
            if (desejaComprar(scanner)) {
                System.out.println("Cliente encontrou o produto desejado.");
            } else {
                System.out.println("Cliente não encontrou o produto desejado.");
            }
        }

        System.out.println("Decisão: O preço do produto agradou?");
        if (precoAgradou(scanner)) {
            System.out.println("Cliente coloca produto no carrinho.");
            if (desejaOutroProduto(scanner)) {
                System.out.println("Cliente adiciona o produto ao carrinho.");
                levarCarrinhoAoCaixa(scanner);
            } else {
                levarCarrinhoAoCaixa(scanner);
            }
        } else {
            System.out.println("Cliente sai da procura ou desiste da compra.");
            System.out.println("Cliente sai da JavaStore. Fim.");
        }
    }

    public static void explorarProdutos(Scanner scanner) {
        System.out.println("Explorando produtos...");
    }

    public static boolean desejaAjuda(Scanner scanner) {
        System.out.println("Decisão: Deseja ajuda de um funcionário? (Digite 'sim' ou 'nao')");
        String resposta = scanner.nextLine();
        return resposta.equalsIgnoreCase("sim");
    }

    public static boolean desejaComprar(Scanner scanner) {
        System.out.println("Decisão: Deseja comprar? (Digite 'sim' ou 'nao')");
        String resposta = scanner.nextLine();
        return resposta.equalsIgnoreCase("sim");
    }

    public static boolean precoAgradou(Scanner scanner) {
        System.out.println("Decisão: O preço do produto agradou? (Digite 'sim' ou 'nao')");
        String resposta = scanner.nextLine();
        return resposta.equalsIgnoreCase("sim");
    }

    public static boolean desejaOutroProduto(Scanner scanner) {
        System.out.println("Decisão: Cliente deseja outro produto? (Digite 'sim' ou 'nao')");
        String resposta = scanner.nextLine();
        return resposta.equalsIgnoreCase("sim");
    }

    public static void levarCarrinhoAoCaixa(Scanner scanner) {
        System.out.println("Cliente leva o carrinho ao caixa e finaliza a compra.");
        if (temDinheiro(scanner)) {
            System.out.println("Cliente tem dinheiro. Cliente pega o cartão e faz o pagamento no caixa.");
            System.out.println("Cliente leva os produtos para casa. Fim.");
        } else {
            System.out.println("Cliente não tem dinheiro. Cliente sai da JavaStore. Fim.");
        }
    }

    public static boolean temDinheiro(Scanner scanner) {
        System.out.println("Decisão: Cliente tem dinheiro? (Digite 'sim' ou 'nao')");
        String resposta = scanner.nextLine();
        return resposta.equalsIgnoreCase("sim");
    }
}
