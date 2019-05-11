public class Producer {
    private int number;
    private int price;
    private String owner;

<<<<<<< HEAD
    String colour;
    int maxSpeed;
    String type;
    int registrationNumber;
=======
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

    public Producer(int number, Integer price, String owner) {
        this.number = number;
        this.price = price;
        this.owner = owner;
    }
    public void createCar(){
        Producer car = new Producer(number,null,null);
>>>>>>> 2c6e58192bd57d622cd545827ed8074f677a1a10

    }

    public Producer(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
