public class Factory {

    public Dealer dealer;

    public static void main(String[] args) {
        Dealer sell = new Dealer(122344);
        Producer car = new Producer(12345);

    }

}
