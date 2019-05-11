public class Factory {
    private int number;
    private int price;
    private String owner;

    public Factory(int number, int price, String owner) {
        this.number = number;
        this.price = price;
        this.owner = owner;
    }

    public static void main(String[] args) {
        Factory car = new Factory(123,321,"Adriam");
        System.out.println(car);
    }

}
