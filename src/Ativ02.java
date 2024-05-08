import java.util.Scanner;
import java.util.Stack;

public class Ativ02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para verificar se é um palíndromo: ");
        String entrada = scanner.nextLine();
        String texto = entrada.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (ehPalindromo(texto)) {
            System.out.println("A string \"" + entrada + "\" é um palíndromo.");
        } else {
            System.out.println("A string \"" + entrada + "\" não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean ehPalindromo(String texto){
        Stack<Character> pilha = new Stack<>();
        int tamanho = texto.length();
        int metade = tamanho / 2;
        for (int i = 0; i < metade; i++) {
            pilha.push(texto.charAt(i));
        }
        int inicioSegundaMetade = (tamanho % 2 == 0) ? metade : metade + 1;
        for (int i = inicioSegundaMetade; i < tamanho; i++) {
            char caractere = texto.charAt(i);
            if (pilha.isEmpty() || pilha.pop() != caractere) {
                return false;
            }
        }
        return pilha.isEmpty();
    }
}
