public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("hahahahhaahhaah");

        Person Me = new Person ("Kent", 18);

        Person Friend = new Person("Klein", 19);

        Person Classmate = new Person("Eiron", 19);
        Person Classmate1 = new Person("Juliann", 19);
        Person Classmate2 = new Person("Kate", 19);

        Me.addFriend(Friend);
        Me.addClassmate(Classmate);
        Me.addClassmate(Classmate1);
        Me.addClassmate(Classmate2);

        Pet Dog = new Pet("Wink", 6, Me);
        Dog.showOwner();

        Car sportCar = new Car(" Black ", " Mustang ", Me, 120);
        sportCar.showCarOwner();

    }
}
    
