import java.util.Scanner;
import java.util.Stack;

public class Ativ01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Livro> pilha = new Stack<>();

        System.out.println("Bem-vindo ao Gerenciador de Livros para as Férias!");
        System.out.println("Escolha uma opção:");
        System.out.println("a) Inserir na Pilha");
        System.out.println("b) Consultar na Pilha");
        System.out.println("c) Remover na Pilha");
        System.out.println("d) Esvaziar na Pilha");
        System.out.println("e) Sair");

        boolean sair = false;
        while (!sair){
            System.out.print("Opção: ");
            String opcao = scanner.nextLine();
            switch (opcao){
                case "a":
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o nome do autor: ");
                    String autor = scanner.nextLine();
                    Livro novoLivro = new Livro(titulo,autor);
                    pilha.push(novoLivro);
                    System.out.println("Livro \"" + titulo + "\" inserido na pilha.");
                    break;

                case "b":
                    if (pilha.isEmpty()){
                        System.out.println("A pilha está vazia.");
                    } else {
                        Livro livroTopo = pilha.peek();
                        System.out.println("Livro no topo da pilha:");
                        System.out.println("Título: " + livroTopo.getTitulo());
                        System.out.println("Autor: " + livroTopo.getAutor());
                    }
                    break;
                case "c":
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        Livro livroRemovido = pilha.pop();
                        System.out.println("Livro removido da pilha:");
                        System.out.println("Título: " + livroRemovido.getTitulo());
                        System.out.println("Autor: " + livroRemovido.getAutor());
                    }
                    break;
                case "d":
                    System.out.println("Esvaziando a pilha de livros:");
                    while (!pilha.isEmpty()) {
                        Livro livroRemovido = pilha.pop();
                        System.out.println("Título: " + livroRemovido.getTitulo() + " removido da pilha.");
                    }
                    break;
                case "e":
                    System.out.println("Obrigada, volte sempre!");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }
    }
}
