package Module2_5.Lagersystem;

class Item {
    private String name;
    private double price;

    Item (String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }
}
