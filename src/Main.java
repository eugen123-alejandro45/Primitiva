public class Main {
    public static void main(String[] args) {
        Ticket t = new Ticket(5);
        System.out.println("------------PRIMITIVA---------------");
        System.out.println(t);
        System.out.println("------------NÚMEROS USADOS----------");
        t.printUsedNumbers();
    }
}
