public class Main {

    public static void main(String[] args) {

        MiLista lista = new MiLista();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        System.out.println("Lista: " + lista);
        System.out.println("Tamaño: " + lista.getSize());
        System.out.println("Cabeza: " + lista.getHead());
        System.out.println("Cola: " + lista.getTail());

        System.out.println("¿Contiene 20?: " + lista.contains(20));
        System.out.println("¿Contiene 50?: " + lista.contains(50));

        lista.shuffle();

        System.out.println("Lista mezclada: " + lista);
    }
}