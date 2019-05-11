public class Client {
    private String name;
    private int money;
    public void buyCar(Producer producer){
        if (producer.getPrice()<money) {
            producer.setOwner(name);
        } else {
            System.out.println("Za mało pieniędzy");
        }

    }
}
