public class Cashier{


    public void checkOut(GroceryItem item){
        System.out.println("You have purchased " + item.name);
    }
    public void showItemPrice(GroceryItem item){
        System.out.println("The price is " + item.price);  
    }
}

