public class Producer {
    private int number;
    private Dealer price;
    private Client owner;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Dealer getPrice() {
        return price;
    }

    public void setPrice(Dealer price) {
        this.price = price;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Producer(int number, Dealer price, Client owner) {
        this.number = number;
        this.price = price;
        this.owner = owner;
    }
    public void createCar(){
        Producer car = new Producer(number,0,);

    }
        
}
