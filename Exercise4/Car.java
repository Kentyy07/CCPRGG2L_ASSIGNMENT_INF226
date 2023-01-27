public class Car {
    
    String color;
    String brand;
    int price;
    Person owner;

    Car(String carColor, String carBrand, Person ownerName, int carPrice){
        this.color = carColor;
        this.brand = carBrand;
        this.owner = ownerName;
        this.price = carPrice;
    }
    void showCarOwner(){
        System.out.println("This " + this.color + this.brand + ". This owned by "+ owner.name + ". which cost $" + this.price);
    }
}
