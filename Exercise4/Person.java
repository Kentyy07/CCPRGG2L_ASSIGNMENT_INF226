public class Person {
    int age;
    String name;

    Person(String personName, int personAge){
        this.name = personName;
        this.age = personAge;

    }

    void addFriend(Person friend){
        System.out.println(this.name + " is friend with " + friend.name);
    }
    void addClassmate(Person Classmate){
        System.out.println(this.name + " is classmate with " + Classmate.name);
    }   
}
