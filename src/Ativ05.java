import java.util.Scanner;
import java.util.Stack;

public class Ativ05 {
    private Stack<String> pilha;

    // Construtor
    public Ativ05() {
        pilha = new Stack<>();
    }

    // Função para adicionar uma tarefa à pilha
    public void adicionarTarefa(String tarefa) {
        pilha.push(tarefa);
    }

    // Função para remover uma tarefa da pilha
    public String removerTarefa() {
        if (!pilha.isEmpty()) {
            return pilha.pop();
        }
        return null; // Retorna null se a pilha estiver vazia
    }

    // Função para verificar se a pilha está vazia e se todas as tarefas foram concluídas
    public boolean tarefasConcluidas() {
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ativ05 pilhaPassos = new Ativ05();

        System.out.println("Bem-vindo ao Gerenciador de Passos de Tarefas!");

        // Loop principal do programa
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("a) Adicionar tarefa à pilha");
            System.out.println("b) Remover tarefa da pilha");
            System.out.println("c) Verificar se as tarefas foram concluídas");
            System.out.println("d) Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "a":
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String tarefaAdicionada = scanner.nextLine();
                    pilhaPassos.adicionarTarefa(tarefaAdicionada);
                    System.out.println("Tarefa \"" + tarefaAdicionada + "\" adicionada à pilha.");
                    break;
                case "b":
                    String tarefaRemovida = pilhaPassos.removerTarefa();
                    if (tarefaRemovida != null) {
                        System.out.println("Tarefa removida da pilha: " + tarefaRemovida);
                    } else {
                        System.out.println("A pilha está vazia. Não há tarefas para remover.");
                    }
                    break;
                case "c":
                    if (pilhaPassos.tarefasConcluidas()) {
                        System.out.println("Todas as tarefas foram concluídas!");
                    } else {
                        System.out.println("Ainda há tarefas pendentes.");
                    }
                    break;
                case "d":
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0); // Encerra o programa
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }
}
