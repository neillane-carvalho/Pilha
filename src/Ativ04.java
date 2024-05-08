import java.util.Scanner;
import java.util.Stack;

public class Ativ04 {
    private Stack<String> pilha;

    // Construtor
    public Ativ04() {
        pilha = new Stack<>();
    }

    // Função para adicionar uma página à pilha
    public void adicionarPagina(String pagina) {
        pilha.push(pagina);
    }

    // Função para remover uma página da pilha
    public String removerPagina() {
        if (!pilha.isEmpty()) {
            return pilha.pop();
        }
        return null; // Retorna null se a pilha estiver vazia
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ativ04 pilhaPaginas = new Ativ04();

        System.out.println("Bem-vindo ao Gerenciador de Páginas Web!");
        boolean sair = false;
        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("a) Adicionar página à pilha");
            System.out.println("b) Remover página da pilha");
            System.out.println("c) Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "a":
                    System.out.print("Digite a página a ser adicionada: ");
                    String paginaAdicionada = scanner.nextLine();
                    pilhaPaginas.adicionarPagina(paginaAdicionada);
                    System.out.println("Página \"" + paginaAdicionada + "\" adicionada à pilha.");
                    break;
                case "b":
                    String paginaRemovida = pilhaPaginas.removerPagina();
                    if (paginaRemovida != null) {
                        System.out.println("Página removida da pilha: " + paginaRemovida);
                    } else {
                        System.out.println("A pilha está vazia. Não há páginas para remover.");
                    }
                    break;
                case "c":
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}
