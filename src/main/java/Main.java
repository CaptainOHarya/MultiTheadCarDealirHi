public class Main {
    public static void main(String[] args) {

        final Manufacturer manufacturer = new Manufacturer();

        Runnable selling = manufacturer::sellCar;
        Runnable recieving = manufacturer::acceptCar;

        for (int i = 1; i <= 10; i++) {
            new Thread(null, selling, "Покупатель " + i).start();
            new Thread(null, recieving, "Поставщик авто ").start();
        }
    }
}