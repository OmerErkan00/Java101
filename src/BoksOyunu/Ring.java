package BoksOyunu;

public class Ring {
    Fighters name1;
    Fighters name2;
    int minWeight;
    int maxWeight;

    Ring(Fighters name1, Fighters name2,int minWeight, int maxWeight){
        this.name1 = name1;
        this.name2 = name2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    public void run(){
        if (weightControl()){
            while (name1.health > 0 && name2.health > 0){
                printScore();
                System.out.println("-----YENİ ROUND-----");
                name2.health = name1.hit(name2);
                if (win()){
                    break;
                }
                name1.health = name2.hit(name1);
                if (win()){
                    break;
                }
            }
        }else {
            System.out.println("Kilolar uyuşmuyor.");
        }
    }


    public boolean weightControl() {
        return ((name1.weight >= minWeight && name1.weight <= maxWeight) && (name2.weight >= minWeight && name2.weight <= maxWeight));
    }


    public boolean win() {
        if (name1.health == 0) {
            System.out.println(name2.name + " Maçı kazandı.");
            return true;
        } else if (name2.health == 0) {
            System.out.println(name1.name + " Maçı kazandı.");
            return true;

        }
        return false;
    }


    public void printScore(){
        System.out.println(name1.name + " kalan can :" + name1.health);
        System.out.println(name2.name + " kalan can :" + name2.health);
    }
}
