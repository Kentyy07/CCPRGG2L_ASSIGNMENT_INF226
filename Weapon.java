public class Weapon {
    String name;
    int damage;
    String rarity;
    
    String sayMyName(){
        return this.name + " "  + this.rarity;
    }
    public void myDamage() {
        System.out.println("My damage is " + damage);
    }
    void addDamage(int additionalDamage){
        int myDamage = this.damage + additionalDamage;

        System.out.println("Damage increased from " + this.damage + " to " + myDamage );

        this.damage = myDamage;
    }

}

