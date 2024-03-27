

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */

    public static void main(String[] args) {

        System.out.println("Введите заказ:");
        OrderInputFromConsole inputFromConsole = new OrderInputFromConsole();
        Order order = inputFromConsole.inputFromConsole();
        OrderSaveToJson OrderSaveToJson = new OrderSaveToJson(order, "order.json");
        OrderSaveToJson.save();
    }
}
