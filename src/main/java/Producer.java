public class Producer {

    String colour;
    int maxSpeed;
    String type;
    int registrationNumber;

    public Producer(String colour, int maxSpeed, String type) {
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public Producer(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
