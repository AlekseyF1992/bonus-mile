public class Main {
    public static void main(String[] args) {
        int ticketprice = 5875;
        int rublesPerMil = 20;
        int totalmile = ticketprice / rublesPerMil;

        System.out.println("Стоимость билета " + ticketprice + " руб.");
        System.out.println("Будет начисленно " + totalmile + " миль.");
    }
}
