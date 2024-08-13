import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int size = 3;

        StaticQueue<String> queue= new StaticQueue<String>(size);

        System.out.println("Primeiro objeto adicionado");
        queue.push("L");
        System.out.println(queue.isFull());

        System.out.println("Segundo objeto adicionado");
        queue.push("E");
        System.out.println("Terceiro Objeto adicionado");
        queue.push("O");
        System.out.println(queue.print());

//        System.out.println(queue.isEmpty());
//        System.out.println(queue.isFull());
        System.out.println("Primeiro objeto removido");
        queue.pop();
        System.out.println(queue.print());

        System.out.println("Segundo objeto removido");
        queue.pop();
        System.out.println(queue.print());

//        System.out.println("Terceiro objeto removido");
//        queue.pop();
//        System.out.println(queue.print());

        System.out.println("Verifica se esta vasia");
        System.out.println(queue.isEmpty());

        System.out.println("Limpa a lista");
        queue.clear();
        System.out.println(queue.print());

        System.out.println("Verifica se esta vasia");
        System.out.println(queue.isEmpty());
//        System.out.println(queue.isFull());



    }
}
