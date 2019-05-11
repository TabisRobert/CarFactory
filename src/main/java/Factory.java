public class Factory {
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

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
