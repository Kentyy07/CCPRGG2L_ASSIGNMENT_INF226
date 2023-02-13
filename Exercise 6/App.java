public class App {
    public static void main(String[] args) throws Exception {
        
        //item in form of a diaper
        //polymorphic variable
        GroceryItem item1 = new Diaper();
        item1.name = "Pampers";
        item1.price = 100;
        item1.showItemName();

        // item in form of a napkin
        GroceryItem item2 = new Napkins();
        item2.name = "Moddess";
        item2.price = 65;
        item2.showItemName();

        //Cashier object
        Cashier c1 = new Cashier();
        //polymorphic parameter
        c1.checkOut(item1);
        c1.checkOut(item2);

        c1.showItemPrice(item1);
        c1.showItemPrice(item2);

        //polymorphic array
        GroceryItem[] itemArray = new GroceryItem[2];

        itemArray[0] = item1;
        itemArray[1] = item2;

        double totalAmount = 0.00;

        for (int i = 0; i < itemArray.length; i++){
            itemArray[i].showItemName();
            System.out.println(itemArray[i].price);

            totalAmount += itemArray[i].price;
    
        }
        System.out.println("The total amount is " + totalAmount);

        Cat myCat = new Cat();
        myCat.eat();
    }
}
