package BoksOyunu;

public class Fighters {
    String name;
    int damage;
    int health;
    int weight;
    double dodgeRate;

     public Fighters(String name, int damage, int health, int weight, double dodgeRate){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodgeRate = dodgeRate;
    }
    public int hit (Fighters John){
        System.out.println(this.name + "  " + John.name + "  " + this.damage + "hasar verdi.");
        if (John.dodge()){
            System.out.println(John.name + " " + "Hasarı savurdu.");
            return John.health;
        }
        if (John.health - this.damage < 0){
            return 0;
        }
        return John.health - this.damage;
    }
    public boolean dodge(){
         double dodgeNumber = Math.random() * 100;
         return this.dodgeRate >= dodgeNumber;
    }
}
