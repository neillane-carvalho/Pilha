import java.util.Iterator;
import java.util.Stack;

public class AulaPilha {
    public static void main(String[] args) {
        //criar a pilha
        Stack<String> pilha =new Stack<>();
        //ver se está vazia
        System.out.println("A lista está vazia? " + pilha.empty());
        if (pilha.empty()) {
            System.out.println("Sua pilha está vazia!");
        } else {
            System.out.println("A sua pilha está cheia!");
        }

        //adicionar elementos a pilha
        System.out.println("Adicionando a pilha...");
        pilha.add("A");
        pilha.add("B");
        pilha.add("C");
        pilha.push("D");
        pilha.addElement("E");

        System.out.println("A lista está vazia? " + pilha.empty());
        if (pilha.empty()) {
            System.out.println("Sua pilha está vazia!");
        } else {
            System.out.println("A sua pilha está cheia!");
        }

        //qual o topo da pilha
        System.out.println("Qual o topo da pilha? " + pilha.peek());

        //remover o topo
        System.out.println("Removendo o topo pilha...");
        pilha.pop();
        System.out.println("Qual o novo topo da pilha? " + pilha.peek());

        //implementando o iteractor
        System.out.println("Aprendendo o Iterator");
        //listar a pilha
        for (String s : pilha) {
            System.out.println(s);
        }
    }
}