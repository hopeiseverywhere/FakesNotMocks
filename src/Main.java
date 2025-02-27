public class Main {
    public static void main(String[] args) {
        // Unit Test for Cash class

        // Test setup
        // Exchange exchange = new NYSE("someAccessKey");
        // Cash dollar = new Cash(exchange, 100);
        // System.out.println("Dollar: " + dollar.toString());

        // // Test 'in' method of Cash
        // Cash euro = dollar.in("Euro");
        // System.out.println("Dollar to Euro: " + euro.toString());

        // Unit Test for Cash class

        // Test setup
        Exchange exchange = new FakeExchange("someAccessKey");
        Cash dollar = new Cash(exchange, 100);
        System.out.println("Dollar: " + dollar.toString());

        // Test 'in' method of Cash
        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());
    }
}
