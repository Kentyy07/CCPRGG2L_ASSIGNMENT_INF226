public class Character {
    int strength;
    int agility;
    int intelligence;
    int damage;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }
    
    public void sayMyStrength() {
        System.out.println("My strength is " + strength);
    }
    public void Attack() {
        System.out.println("I am attacking");
    }
}