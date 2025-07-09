import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> listaAfazeres = new LinkedList<>();
        int opc = 0;

        while (opc != 4) {
            System.out.println("\nMINHA LISTA.COM");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Visualizar tarefas");
            System.out.println("3 - Marcar tarefa como concluída");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opc = sc.nextInt();
            sc.nextLine();

            if (opc == 1) {
                System.out.println("Digite sua tarefa:");
                String tarefa = sc.nextLine();
                listaAfazeres.add(tarefa);
                System.out.println("Tarefa adicionada.");
            } else if (opc == 2) {
                if (listaAfazeres.isEmpty()) {
                    System.out.println("A lista de tarefas está vazia!");
                } else {
                    System.out.println("Tarefas pendentes:");
                    System.out.println(listaAfazeres);
                }
            } else if (opc == 3) {
                String removida = listaAfazeres.poll();
                if (removida != null) {
                    System.out.println("Tarefa concluída: " + removida);
                } else {
                    System.out.println("A lista de tarefas está vazia!");
                }
            } else if (opc != 4) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Encerrando o programa...");
        sc.close();
    }
}