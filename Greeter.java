public class Greeter {
    public static void main(String[] args) {

        GreetMachine gm;

        if (args.length > 0) {
            gm = new GreetMachine(args[0]);
        } else {
            gm = new GreetMachine();
        }

        System.out.println(gm);

        gm.setName("Bill");
        System.out.println("After setName");
        System.out.println(gm);

        System.out.println("Have a nice day");
    }
}