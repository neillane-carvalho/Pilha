import java.util.Scanner;
import java.util.Stack;

public class Ativ03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pilhaTarefas = new Stack<>();

        System.out.println("Bem-vindo ao Gerenciador de Tarefas!");
        System.out.println("Escolha uma opção:");
        System.out.println("a) Inserir tarefa na pilha");
        System.out.println("b) Obter a próxima tarefa da pilha");
        System.out.println("c) Sair");

        boolean sair = false;
        while (!sair) {
            System.out.print("Opção: ");
            String opcao = scanner.nextLine();
            switch (opcao) {
                case "a":
                    System.out.print("Digite a tarefa a ser inserida na pilha: ");
                    String tarefa = scanner.nextLine();
                    pilhaTarefas.push(tarefa);
                    System.out.println("Tarefa \"" + tarefa + "\" inserida na pilha.");
                    break;
                case "b":
                    if (pilhaTarefas.isEmpty()) {
                        System.out.println("A pilha de tarefas está vazia.");
                    } else {
                        String proximaTarefa = pilhaTarefas.pop();
                        System.out.println("Próxima tarefa a ser cumprida: " + proximaTarefa);
                    }
                    break;
                case "c":
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
